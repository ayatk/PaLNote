/*
 * PaLNote
 * http://palnote.org
 *
 * Copyright (c) 2014 Ayana Tokikaze. All rights reserved.
 * 　Released under the Apache v2 License.
 *
 * Created by Ayana Tokikaze on 14/10/07.
 */
package net.snvx.palnote.core.ui;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.util.Calendar;
import java.util.Properties;

public final class AboutAppWindow extends Stage {

  public AboutAppWindow() {
    initModality(Modality.APPLICATION_MODAL);
    initStyle(StageStyle.TRANSPARENT);

    VBox vbox = new VBox();

    Label appName = new Label("PaLNote");
    appName.setStyle("-fx-font-size: 20pt;");

    Label copyright = new Label("Copyright (c) " + Calendar.getInstance().get(Calendar.YEAR) + " Ayana Tokikaze. All rights reserved.");

    Properties properties = System.getProperties();
    String javaVersion = properties.getProperty("java.runtime.version", properties.getProperty("java.version", "unknown"));
    String arch = properties.getProperty("os.arch", "");

    String vmVersion = properties.getProperty("java.vm.name", "unknown");
    String vmVendor = properties.getProperty("java.vendor", "unknown");

    Label javaProperties = new Label("JRE: " + javaVersion + " " + arch);

    Label JVM = new Label("JVM: " + vmVersion + " " + vmVendor);

    Button windowClose = new Button("Close");
    windowClose.setOnAction((event) -> hide());

    vbox.getChildren().addAll(appName, copyright, javaProperties, JVM, windowClose);
    Scene scene = new Scene(vbox);
    setScene(scene);
  }
}
