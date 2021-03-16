package vaccination;


import org.flywaydb.core.Flyway;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mariadb.jdbc.MariaDbDataSource;

import java.sql.SQLException;



class VacDAOTest {

    VacDAO vacDAO;

    @BeforeEach
    public void init(){
        MariaDbDataSource dataSource;
        try {
            dataSource = new MariaDbDataSource();
            dataSource.setUrl("jdbc:mariadb://localhost:3306/vaccination?useUnicode=true");
            dataSource.setUser("vaccination");
            dataSource.setPassword("vaccination");
        }
        catch (SQLException se){
            throw new IllegalStateException("conn failed", se);
        }

        Flyway flyway = Flyway.configure().dataSource(dataSource).load();
        flyway.clean();
        flyway.migrate();

        vacDAO = new VacDAO(dataSource);
    }

    @Test
    public void HelloWorld(){
        Citizen citizen = new Citizen("D", "7140", 28, "c@c.hu", "044683186");
        vacDAO.registerCitizen(citizen);
    }

}