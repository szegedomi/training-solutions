package activitytracker;

import javax.sql.DataSource;
import java.sql.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class ActivityDao {

    private DataSource dataSource;

    public ActivityDao(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public Activity saveActivity(Activity activity) {
        try (Connection conn = dataSource.getConnection();
             PreparedStatement stmt = conn.prepareStatement("insert into activities(start_time, activity_desc, activity_type) values(?,?,?)", Statement.RETURN_GENERATED_KEYS))
        {
            stmt.setTimestamp(1, Timestamp.valueOf(activity.getStartTime()));
            stmt.setString(2, activity.getDesc());
            stmt.setString(3, activity.getType().toString());
            stmt.executeUpdate();

            try (ResultSet rs = stmt.getGeneratedKeys()) {
                if (rs.next()) {
                    long id = rs.getLong(1);
                    return new Activity(id, activity.getStartTime(), activity.getDesc(), activity.getType());
                }
            } catch (SQLException se) {
                throw new IllegalStateException("Cannot return key", se);
            }

        } catch (SQLException se) {
            throw new IllegalStateException("Cannot create records", se);
        }
        throw new IllegalStateException("Could not return");
    }



    public Activity findActivityByID(long id){
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

    public List<Activity> listActivities(){
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

    public List<Activity> selectActivitiesBeforeDate(LocalDate date){
        List<Activity> result = new ArrayList<>();
        try (Connection conn = dataSource.getConnection();
             PreparedStatement stmt = conn.prepareStatement("select * from activities where start_time < ? "))
        {
            LocalDateTime param = date.atTime(0,0,0);
            stmt.setTimestamp(1, Timestamp.valueOf(param));
            try(ResultSet rs = stmt.executeQuery()){
                while(rs.next()){
                    Activity act = new Activity(rs.getLong("id"),rs.getTimestamp("start_time").toLocalDateTime(),rs.getString("activity_desc"), Type.valueOf(rs.getString("activity_type")));
                    result.add(act);
                }
                return result;
            }
            catch (SQLException se){
                throw new IllegalStateException("Cannot read", se);
            }
            }
        catch (SQLException se) {
            throw new IllegalStateException("Cannot connect", se);
        }
    }




}
