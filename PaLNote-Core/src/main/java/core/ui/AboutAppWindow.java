/*
 * PaLNote
 * http://palnote.org
 *
 * Copyright (c) 2014 Ayana Tokikaze. All rights reserved.
 * 　Released under the Apache v2 License.
 *
 * Created by Ayana Tokikaze on 14/10/07.
 */
package core.ui;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.util.Calendar;
import java.util.Properties;

public class AboutAppWindow extends Stage {

  public AboutAppWindow() {
    initModality(Modality.APPLICATION_MODAL);
    initStyle(StageStyle.TRANSPARENT);

    VBox vbox = new VBox();

    Label lab1 = new Label("PaLNote");
    lab1.setStyle("-fx-font-size: 20pt;");
    vbox.getChildren().add(lab1);

    Label lab3 = new Label("Copyright (c) " + Calendar.getInstance().get(Calendar.YEAR) + " Ayana Tokikaze. All rights reserved.");
    vbox.getChildren().add(lab3);

    Properties properties = System.getProperties();
    String javaVersion = properties.getProperty("java.runtime.version", properties.getProperty("java.version", "unknown"));
    String arch = properties.getProperty("os.arch", "");

    String vmVersion = properties.getProperty("java.vm.name", "unknown");
    String vmVendor = properties.getProperty("java.vendor", "unknown");

    Label lab4 = new Label("JRE: " + javaVersion + " " + arch);
    vbox.getChildren().add(lab4);

    Label lab5 = new Label("JVM: " + vmVersion + " " + vmVendor);
    vbox.getChildren().add(lab5);

    Button but1 = new Button("Close");
    but1.setOnAction((event) -> hide());
    vbox.getChildren().add(but1);

    Scene scene = new Scene(vbox);
    setScene(scene);
  }
}
