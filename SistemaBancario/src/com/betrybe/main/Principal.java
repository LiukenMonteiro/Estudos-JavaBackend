package com.betrybe.main;

import com.betrybe.core.ContaCorrente;
import com.betrybe.core.ContaPoupanca;

/**
 * .
 */
public class Principal {

  public static void main(String[] args) {
    ContaCorrente cc = new ContaCorrente();
    cc.depositar(100);
    System.out.println("O saldo inicial da conta corrente é: " + cc.getSaldo());

    cc.sacar(20);
    System.out.println("O saldo atual da conta corrente é: " + cc.getSaldo());

    ContaPoupanca cp = new ContaPoupanca();
    cp.depositar(100);
    System.out.println("O saldo incial da conta poupança é: " + cp.getSaldo());

    cp.sacar(20);
    System.out.println("O saldo atual da conta corrente é: " + cc.getSaldo());
    
  }

}
