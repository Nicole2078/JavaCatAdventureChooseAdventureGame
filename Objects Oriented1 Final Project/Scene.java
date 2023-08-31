/*
 * Author: Nicole Hackler
 * Date: 8/31/2023
 * 
 * This is the class to create a Scene object for the final project for Objects Oriented 1
 * This class contains a getScene(), getScene(), setSceneNumber(int sceneNumber), getSceneNumber()
 * in order to set and get new Scenes and to set a new "Hidden" reverence variable if needed.
 */
public class Scene {
	private String scene = "";
	private int sceneNumber = 0;
	//non-args constructor
	Scene(){	
	}
	//constructor with sceneNumber and string scene
	Scene(int sceneNumber, String scene){
		this.scene = scene;
		this.sceneNumber = sceneNumber;
	}
	//Methods to get and set the data fields
	public String getScene() {
		return this.scene;
	}
	public void setScene(String scene) {
		this.scene = scene;
	}
	public void setSceneNumber(int sceneNumber) {
		this.sceneNumber = sceneNumber;
	}
	public int getSceneNumber() {
		return this.sceneNumber;
	}
}