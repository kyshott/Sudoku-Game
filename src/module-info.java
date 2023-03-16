module mytestjavafxproject1 {
	requires javafx.controls;
	requires javafx.media;
	requires javafx.base;
	requires javafx.graphics;
	
	opens application to javafx.graphics, javafx.fxml;
}
