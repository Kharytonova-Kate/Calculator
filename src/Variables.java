
public class Variables {
	//������� ������ Variables ��������� ��� ������ ������ initialization ������ mathActions(�� ���� ��� ������������� ���������� �������������
	private String name; // ��� ����������, ������� ���� ���������������� �������������
	private double value; // �������� ���������� name
	
	
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
public Variables (String name, double value) { //����������� ��� �������� �������� ������ Variables
	this.setName(name);
	this.setValue(value);
}

}
