package net.socket.udp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.*;

/**
 * Created by weizwang on 2016/4/6.
 */
public class UDPDiscardClient {
    public static void main(String[] args) {
        String hostname="localhost";
        int port=9;
        try {
            InetAddress server= InetAddress.getByName(hostname);
            BufferedReader userIn=new BufferedReader(new InputStreamReader(System.in));
            DatagramSocket client=new DatagramSocket();
            while (true){
                String inline=userIn.readLine();
                if(inline.indexOf('.')!=-1)
                    break;
            byte[]data=inline.getBytes("UTF-8");
                DatagramPacket dp=new DatagramPacket(data,data.length,server,port);
                client.send(dp);
            }
            client.close();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (SocketException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
