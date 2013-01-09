
public class Variables {
	//объекты класса Variables создаются при вызове метода initialization класса mathActions(то есть при инициализации переменной пользователем
	private String name; // имя переменной, которая была инициализирована пользователем
	private double value; // значение переменной name
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getValue() {
		return value;
	}
	public void setValue(double value) {
		this.value = value;
	}
public Variables (String name, double value) { //конструктор для создания объектов класса Variables
	this.setName(name);
	this.setValue(value);
}

}
