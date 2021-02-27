package activitytracker;

import org.mariadb.jdbc.MariaDbDataSource;

import javax.sql.DataSource;
import javax.xml.crypto.Data;
import java.sql.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class ActivityTracker {

    public void insertAct(DataSource dataSource, Activity act){
        try(Connection conn = dataSource.getConnection();
            PreparedStatement stmt = conn.prepareStatement("insert into activities(start_time, activity_desc, activity_type) values(?,?,?)")){
            stmt.setTimestamp(1, Timestamp.valueOf(act.getStartTime()));
            stmt.setString(2, act.getDesc());
            stmt.setString(3, act.getType().toString());
            stmt.executeUpdate();
        }
        catch (SQLException se){
            throw new IllegalStateException("Cannot create records", se);
        }
    }

    public Activity selectActByID(DataSource dataSource, long id){
        try(Connection conn = dataSource.getConnection();
            PreparedStatement stmt = conn.prepareStatement("select * from activities where id = ?"))
        {
            stmt.setLong(1, id);
            try(ResultSet rs = stmt.executeQuery()){
                if(rs.next()){
                    Activity act = new Activity(rs.getLong("id"),rs.getTimestamp("start_time").toLocalDateTime(),rs.getString("activity_desc"), Type.valueOf(rs.getString("activity_type")));
                    return act;
                }
                throw new IllegalArgumentException("not found");
            }
        }
        catch (SQLException se){
            throw new IllegalStateException("Cannot querry", se);
        }

    }

    public List<Activity> selectAllAct(DataSource dataSource){
        List<Activity> result = new ArrayList<>();
        try (Connection conn = dataSource.getConnection();
             PreparedStatement stmt = conn.prepareStatement("select * from activities");
            ResultSet rs = stmt.executeQuery())
        {
            while(rs.next()){
                Activity act= new Activity(rs.getLong("id"),rs.getTimestamp("start_time").toLocalDateTime(),rs.getString("activity_desc"), Type.valueOf(rs.getString("activity_type")));
                result.add(act);
            }
            return result;
        }
        catch (SQLException se){
            throw new IllegalArgumentException("Cannot query", se);
        }
    }

    public static void main(String[] args) {

        MariaDbDataSource dataSource;
        try{
            dataSource = new MariaDbDataSource();
            dataSource.setUrl("jdbc:mariadb://localhost:3306/activitytracker?useUnicode=true");
            dataSource.setUser("activitytracker");
            dataSource.setPassword("activitytracker");
        }
        catch(SQLException se){
            throw new IllegalStateException("Cannot connect", se);
        }


        Activity act1 = new Activity(LocalDateTime.of(2021,02,27,14,00), "Running in the park", Type.RUNNING);
        Activity act2 = new Activity(LocalDateTime.of(2021,02,26,14,00), "Biking in the park", Type.BIKING);
        Activity act3 = new Activity(LocalDateTime.of(2021,02,20,14,00), "Hiking in the park", Type.HIKING);

        ActivityTracker at = new ActivityTracker();

        at.insertAct(dataSource, act1);
        at.insertAct(dataSource, act2);
        at.insertAct(dataSource, act3);

        System.out.println(at.selectActByID(dataSource, 1));
        System.out.println(at.selectAllAct(dataSource).size());
    }

}
