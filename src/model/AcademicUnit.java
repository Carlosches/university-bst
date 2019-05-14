package model;

public class AcademicUnit {
	
	private String name;
	private int code;
	private String director;
	
	private AcademicUnit left;
	private AcademicUnit right;
	
	public AcademicUnit(String name, int code, String director) {
		this.name = name;
		this.code = code;
		this.director = director;
	}
	
	/**
	 * @return the code
	 */
	public int getCode() {
		return code;
	}

	/**
	 * @return the left
	 */
	public AcademicUnit getLeft() {
		return left;
	}

	/**
	 * @return the right
	 */
	public AcademicUnit getRight() {
		return right;
	}

	/**
	 * @param left the left to set
	 */
	public void setLeft(AcademicUnit left) {
		this.left = left;
	}

	/**
	 * @param right the right to set
	 */
	public void setRight(AcademicUnit right) {
		this.right = right;
	}
	
	
	
}
