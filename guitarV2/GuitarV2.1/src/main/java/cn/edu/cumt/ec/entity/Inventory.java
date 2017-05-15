package cn.edu.cumt.ec.entity;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Inventory {
  private List<Guitar> guitars;

  public Inventory(List<Guitar> guitars) {
    this.guitars = guitars;
  }
  public List<Guitar> search(GuitarSpec searchSpec) {
	  List<Guitar> matchingGuitars = new LinkedList();
    for (Iterator i = guitars.iterator(); i.hasNext(); ) {
      Guitar guitar = (Guitar)i.next();
      if (guitar.getSpec().matches(searchSpec))
        matchingGuitars.add(guitar);
    }
    return matchingGuitars;
  }
}
