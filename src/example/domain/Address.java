package example.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * 测试实体
 * @author : zhaopanqi
 * @date : Created in 2019/12/31
 */
public class Address implements Serializable {

    private static final long UID = 3222222L;

    private Integer identifier;

    //地址
    private String address;

    //城市
    private String city;

    //省份
    private String province;

    //国家
    private String country;

    //邮编
    private String postalCode;

    private String[] array;

    private List<Integer> list;

    private boolean isExist;

    public Address(){
        list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
    }

    public Integer getIdentifier() {
        return identifier;
    }

    public void setIdentifier(Integer identifier) {
        this.identifier = identifier;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String[] getArray() {
        return array;
    }

    public void setArray(String[] array) {
        this.array = array;
    }

    public List<Integer> getList() {
        return list;
    }

    public void setList(List<Integer> list) {
        this.list = list;
    }

    public boolean isExist() {
        return isExist;
    }

    public void setExist(boolean exist) {
        isExist = exist;
    }
}
