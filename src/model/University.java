package model;

import java.util.ArrayList;
import java.util.List;

public class University {
	
	private String name;
	private String address;
	
	private AcademicUnit root;
	
	public University(String name, String address) {
		this.name = name;
		this.address = address;
	}
	
	public void add(String n, int c, String d) {
		AcademicUnit newAcademicUnit = new AcademicUnit(n, c, d);
		if(root == null) {
			root = newAcademicUnit;
		}else {
			AcademicUnit current = root;
			boolean exit = false;
			while(!exit) {
				
				if(current.compareTo(newAcademicUnit) < 0) {
					if(current.getRight() == null) {
						current.setRight(newAcademicUnit);
						exit = true;
					}else {
						current = current.getRight();
					}
				}else {
					if(current.getLeft() == null) {
						current.setLeft(newAcademicUnit);
						exit = true;
					}else {
						current = current.getLeft();
					}
				}
			}
		}
	}
	
	
	public List<AcademicUnit> preorder(){
		if(root==null) {
			return new ArrayList<AcademicUnit>();
		}
		else {
			return preorder(root, new ArrayList<AcademicUnit>());
		}
	}
	
	public List<AcademicUnit> preorder(AcademicUnit current, List<AcademicUnit> nodes){
		
		if(current.getLeft() == null && current.getRight()==null) {
			nodes.add(current);
			return nodes;
		}else {
			if(current.getLeft() != null && current.getRight()!=null) {
				preorder(current.getLeft(), nodes);
				preorder(current.getRight(), nodes);
				
			}else if(current.getLeft() != null) {
				preorder(current.getLeft(), nodes);
			}
			else {
				preorder(current.getRight(), nodes);
			
			}
			return nodes;
			
		}
		
	}
}
