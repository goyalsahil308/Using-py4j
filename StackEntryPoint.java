package py4j;
import java.util.*;

import py4j.GatewayServer;

public class StackEntryPoint 
{
      List<Integer> list=new ArrayList<>();
      private String str;
    public void setString(String name) 
    {
         str=name;
    }
    public String getString(){
        return str;
    }
    public List<Integer> getList()
    {
        return list;
    }
    public void add(int i)
    {
        list.add(i);
    }
    public void SetElement(int i,int j)
    {
        list.set(i,j);
    }
    public void Sort()
    {
        Collections.sort(list);
    }
    

    public static void main(String[] args)
    {
        StackEntryPoint app=new StackEntryPoint();
        GatewayServer gatewayServer = new GatewayServer(app);
        gatewayServer.start();
        System.out.println("Gateway Server Started");
    }

}