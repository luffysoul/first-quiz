package org.velezreyes.quiz.question6;

import org.velezreyes.quiz.question6.drinks.KarenTea;
import org.velezreyes.quiz.question6.drinks.ScottCola;

public class VendingMachineImpl implements VendingMachine {

  private static VendingMachineImpl instance;
  private int insertedQuarters;

  private VendingMachineImpl() {
    insertedQuarters = 0;
  }

  public static VendingMachineImpl getInstance() {
    if (instance == null) {
      instance = new VendingMachineImpl();
    }
    return instance;
  }

  @Override
  public void insertQuarter() {
    insertedQuarters++;
  }

  @Override
  public Drink pressButton(String name) throws NotEnoughMoneyException, UnknownDrinkException {
    if ("ScottCola".equals(name)) {
      if (insertedQuarters >= 3) {
        insertedQuarters -= 3;
        return new ScottCola();
      } else {
        throw new NotEnoughMoneyException();
      }
    } else if ("KarenTea".equals(name)) {
      if (insertedQuarters >= 4) {
        insertedQuarters -= 4;
        return new KarenTea();
      } else {
        throw new NotEnoughMoneyException();
      }
    } else {
      throw new UnknownDrinkException();
    }
  }
}