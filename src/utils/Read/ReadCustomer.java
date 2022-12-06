package utils.Read;

import model.Customer;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class ReadCustomer {
    public List<Customer> readCustomer(String PATH){
        List<Customer> list=new ArrayList<>();
        FileReader fileReader=null;
        BufferedReader bufferedReader=null;

        try{
            fileReader=new FileReader(PATH);
            bufferedReader=new BufferedReader(fileReader);
            String line=" ";
            while ((line=bufferedReader.readLine())!=null){
                String[] str=line.split(",");
                Customer customer=new Customer(str[0],(str[1]),str[2],str[3],str[4],
                        str[5],str[6],str[7]);
                list.add(customer);
            }

        }catch (Exception e){
            e.printStackTrace();
        }finally {
           try {
               fileReader.close();
               bufferedReader.close();
           }catch (Exception e){
               e.printStackTrace();
           }
        }return list;
    }
}
