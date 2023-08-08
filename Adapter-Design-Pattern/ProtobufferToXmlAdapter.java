/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package adapterpattern;

/**
 *
 * @author Rasel
 */
public class ProtobufferToXmlAdapter implements IAdapter<Protobuffer> {
    private Protobuffer protobuffer;

    public ProtobufferToXmlAdapter(Protobuffer protobuffer) {
        this.protobuffer = protobuffer;
    }

    @Override
    public XML convert(Protobuffer protobuffer) {
        return this.protobuffer.convertToXML();
    }
}