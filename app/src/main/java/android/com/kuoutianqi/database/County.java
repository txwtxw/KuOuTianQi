package android.com.kuoutianqi.database;

import org.litepal.crud.DataSupport;

/**
 * Created by Administrator on 2018/6/6/006.
 */

public class County extends DataSupport{
    private int id;
    private String countyName;
    private int weatherId;
    private int cityId;

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

    public int getWeatherId() {

        return weatherId;
    }

    public void setWeatherId(int weatherId) {
        this.weatherId = weatherId;
    }

    public String getCountyName() {

        return countyName;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    public int getId() {

        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
