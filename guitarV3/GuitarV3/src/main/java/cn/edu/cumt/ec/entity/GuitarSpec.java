package cn.edu.cumt.ec.entity;

public class GuitarSpec {
 
  private String builder; 
  private String model;
  private String type;
  private String backWood;
  private String topWood;

  public GuitarSpec(String builder, String model, String type,
		  String backWood, String topWood) {
    this.builder = builder;
    this.model = model;
    this.type = type;
    this.backWood = backWood;
    this.topWood = topWood;
  }

public String getBuilder() {
	return builder;
}



public void setBuilder(String builder) {
	this.builder = builder;
}



public String getModel() {
	return model;
}



public void setModel(String model) {
	this.model = model;
}



public String getType() {
	return type;
}



public void setType(String type) {
	this.type = type;
}



public String getBackWood() {
	return backWood;
}



public void setBackWood(String backWood) {
	this.backWood = backWood;
}



public String getTopWood() {
	return topWood;
}



public void setTopWood(String topWood) {
	this.topWood = topWood;
}



public boolean matches(GuitarSpec otherSpec) {
	if ((otherSpec.builder!=null) && (!otherSpec.builder.equals("")) &&(!builder.equals(otherSpec.builder)))
	      return false;
	    if ((otherSpec.model!=null) && (!otherSpec.model.equals(""))&&(model != null) && (!model.equals("")) &&
	        (!model.toLowerCase().equals(otherSpec.model.toLowerCase())))
	      return false;
	    if ((otherSpec.type != null) &&(!otherSpec.type.equals("")) &&(!type.equals(otherSpec.type)))
	      return false;
	    if ((otherSpec.backWood != null) &&(!otherSpec.backWood.equals("")) &&(!backWood.equals(otherSpec.backWood)))
	      return false;
	    if (( otherSpec.topWood != null) &&(! otherSpec.topWood.equals("")) &&(!topWood.equals(otherSpec.topWood)))
	      return false;
	    return true;
  }
}
