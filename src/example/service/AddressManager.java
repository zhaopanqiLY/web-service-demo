package example.service;

import example.domain.Address;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author : zhaopanqi
 * @date : Created in 2019/12/31
 */
public class AddressManager {

    //将返回一个预先建立好的Address对象，测试返回复杂对象
    public Address getaddress(){
        Address address = new Address();
        address.setIdentifier(1);
        address.setAddress("xx");
        address.setCity("yy");
        address.setProvince("zz");
        address.setCountry("CN");
        address.setPostalCode("10086");
        address.setExist(false);
        address.setArray(new String[]{"1","2","3"});

        return address;
    }

    //返回传递上来的Address对象，不做修改，测试上传复杂对象
    public Address setaddress(Address address){
        return address;
    }

    //将返回一个预先建立好的list，测试返回list
    public List<Address> getaddressList() {
        List<Address> returnList = new ArrayList<Address>();

        Address address = new Address();
        address.setIdentifier(1);
        address.setAddress("xx");
        address.setCity("yy");
        address.setProvince("zz");
        address.setCountry("CN");
        address.setPostalCode("10086");
        address.setExist(false);
        address.setArray(new String[]{"1","2","3"});

        returnList.add(address);

        address = new Address();
        address.setIdentifier(2);
        address.setAddress("xx2");
        address.setCity("yy2");
        address.setProvince("zz2");
        address.setCountry("CN2");
        address.setPostalCode("100862");
        address.setExist(true);
        address.setArray(new String[]{"12","22","32"});

        returnList.add(address);

        return returnList;
    }

    //返回传递上来的list，不做修改，测试上传list
    public List<Address> setAddressList(List<Address> list){
        return list;
    }

    //将返回一个预先建立好的map，测试返回map
    public Map<Integer, Address> getAddressMap(){
        Map<Integer,Address> returnMap = new HashMap<Integer,Address>();

        Address address = new Address();
        address.setIdentifier(1);
        address.setAddress("xx");
        address.setCity("yy");
        address.setProvince("zz");
        address.setCountry("CN");
        address.setPostalCode("10086");
        address.setExist(false);
        address.setArray(new String[]{"1","2","3"});

        returnMap.put(address.getIdentifier(),address);

        address = new Address();
        address.setIdentifier(2);
        address.setAddress("xx2");
        address.setCity("yy2");
        address.setProvince("zz2");
        address.setCountry("CN2");
        address.setPostalCode("100862");
        address.setExist(true);
        address.setArray(new String[]{"12","22","32"});

        returnMap.put(address.getIdentifier(),address);

        return returnMap;

    }

    //返回传递上来的map，不做修改，测试上传map
    public Map<Integer,Address> setAddressMap(Map<Integer,Address> map){
        return map;
    }

}
