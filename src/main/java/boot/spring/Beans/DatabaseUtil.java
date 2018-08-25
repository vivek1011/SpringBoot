package boot.spring.Beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Make a pool of connections beforehand for fast querying over API at realtime.  
 * */

@Service
public class DatabaseUtil {

    @Value("${spring.database.url}")
    public String databaseUrl;

    @Value("${spring.database}")
    public String databaseName;

    @Value("${spring.username}")
    public String username;

    @Value("${spring.password}")
    public String password;

    /**
    * Usage : By default this would use singleton instance
     * @Autowired
     * private Connection connection;
    * */

    @Bean
    public Connection getConnection() throws SQLException {
        Connection con ;
        try {
            String url =databaseUrl + databaseName +"?allowPublicKeyRetrieval=true&useSSL=false";
            con = DriverManager.getConnection(url, username, password);
            return con ;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

}
