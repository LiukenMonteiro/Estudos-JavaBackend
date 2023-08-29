package com.betrybe.core;

/**
 * .
 */
public class ContaPoupanca extends Conta {

  @Override
  public void sacar(double valor) {
    this.saldo -= valor + 2;
  }

  public void simularRendimentoTaxaFixa() {
    saldo *= 0.05;
  }

  public void simularRendimentoTaxaVariavel(double taxa) {
    saldo *= taxa;
  }
}
