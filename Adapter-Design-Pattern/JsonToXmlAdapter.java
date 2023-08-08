/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package adapterpattern;

/**
 *
 * @author Rasel
 */
public class JsonToXmlAdapter implements IAdapter<JSON> {
    private JSON json;

    public JsonToXmlAdapter(JSON json) {
        this.json = json;
    }

    @Override
    public XML convert(JSON json) {
        return this.json.convertToXML();
    }
}