/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package adapterpattern;

/**
 *
 * @author Rasel
 */
public interface IAdapter<T> {
    XML convert(T file);
}