package activitytracker;

import org.flywaydb.core.Flyway;
import org.mariadb.jdbc.MariaDbDataSource;

import javax.sql.DataSource;
import javax.xml.crypto.Data;
import java.sql.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class ActivityTracker {



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

        Flyway flyway = Flyway.configure().dataSource(dataSource).load();
        flyway.clean();
        flyway.migrate();

        Activity act1 = new Activity(LocalDateTime.of(2021,02,27,14,00), "Running in the park", Type.RUNNING);
        Activity act2 = new Activity(LocalDateTime.of(2021,02,26,14,00), "Biking in the park", Type.BIKING);
        Activity act3 = new Activity(LocalDateTime.of(2021,02,20,14,00), "Hiking in the park", Type.HIKING);

        ActivityDao activityDao = new ActivityDao(dataSource);

        activityDao.saveActivity(act1);
        activityDao.saveActivity(act2);
        activityDao.saveActivity(act3);

        System.out.println(activityDao.findActivityByID(1));
        System.out.println(activityDao.listActivities().size());
    }

}
