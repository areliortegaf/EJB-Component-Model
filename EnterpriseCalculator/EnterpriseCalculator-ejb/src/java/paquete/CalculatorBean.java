/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete;

import javax.ejb.Stateless;

/**
 *
 * @author asortega
 */
@Stateless
public class CalculatorBean implements CalculatorBeanRemote {

    @Override
    public int add() {
        return 0;
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
}
