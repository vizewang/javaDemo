package net.socket.udp;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

/**
 * Created by weizwang on 2016/4/6.
 */
public class UDPDiscardServer {
    public static void main(String[] args) {
        int port=9;
        byte[]buffer=new byte[65507];
        try {
            DatagramSocket server=new DatagramSocket(port);
            DatagramPacket packet=new DatagramPacket(buffer,buffer.length);
            while (true){
                 server.receive(packet);
                String s=new String(packet.getData(),packet.getOffset(),packet.getLength(),"UTF-8");
                System.out.println(packet.getAddress()+"at port:"+packet.getPort()+" says:\n"+s);
                packet.setLength(buffer.length);
            }
        } catch (SocketException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
