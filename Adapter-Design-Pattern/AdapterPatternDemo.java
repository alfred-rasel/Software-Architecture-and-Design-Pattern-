/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package adapterpattern;

/**
 *
 * @author Rasel
 */
public class AdapterPatternDemo {
      public static void main(String[] args) {
        JSON json = new JSON("json data");
        Protobuffer protobuffer = new Protobuffer("protobuffer data");

        IAdapter<JSON> iAdapter = new JsonToXmlAdapter(json);

        IAdapter<Protobuffer> iAdapter2 = new ProtobufferToXmlAdapter(protobuffer);
        XML xml = iAdapter.convert(json);
        XML xml2 = iAdapter2.convert(protobuffer);

        System.out.println(xml.getData());
        System.out.println(xml2.getData());
    }
}
