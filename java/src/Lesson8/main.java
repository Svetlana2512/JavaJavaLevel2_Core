package src.Lesson8;

import com.mysql.cj.jdbc.JdbcConnection;
import src.Lesson7.dataForecastPars.DailyForecasts;
import src.Lesson8.dbConnection.DbConnection;
import src.Lesson8.parseResponse.ParseResponse;

public class main {

    public static void main(String[] args) {

        DbConnection dbConnection = new DbConnection();
        ParseResponse parseResponse = new ParseResponse();

        for (DailyForecasts dailyForecast: parseResponse.getDailyForecasts()) {

            dbConnection.insertValue("St. Petersburg",
                    dailyForecast.getDate(),
                    dailyForecast.getDay().getIconPhrase(),
                    Double.parseDouble(dailyForecast.getTemperature().getMinimum().getValue()));

        }

        System.out.println(dbConnection.getValue("localDate","temperature", 50.0));

    }

}