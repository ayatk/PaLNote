/*
 * PaLNote
 * http://palnote.org
 *
 * Copyright (c) 2014 Ayana Tokikaze. All rights reserved.
 * 　Released under the Apache v2 License.
 *
 * Created by Ayana Tokikaze on 14/10/05.
 */
package net.snvx.palnote.core.view.controller;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.MenuItem;
import javafx.stage.Stage;

import java.io.IOException;

public class MainWindowController {
  @FXML
  private MenuItem about_app;
  @FXML
  private MenuItem check_updates;
  @FXML
  private MenuItem preferences;
  @FXML
  private MenuItem quit_application;
  @FXML
  private Button save;
  @FXML
  private Button undo;
  @FXML
  private Button redo;
  @FXML
  private Button copy;
  @FXML
  private Button console;
  @FXML
  private Button plugins;
  @FXML
  private Button settings;
  @FXML
  private Button bug_report;
  @FXML
  private Button help;
  @FXML
  private Button search;

  @FXML
  public void onAboutApp(ActionEvent event) {
  }

  @FXML
  public void onPreferences(ActionEvent event) throws IOException {
    Stage stage = FXMLLoader.load(getClass().getResource("/fxml/Preference.fxml"));
    stage.setTitle("Preference");
    stage.show();
  }

  @FXML
  public void onCheckUpdate(ActionEvent event) {

  }

  @FXML
  public void onQuitApplication(ActionEvent event) {
    Platform.exit();
  }

  @FXML
  public void onSave(ActionEvent event) {

  }

  @FXML
  public void onUndoButton(ActionEvent event) {

  }

  @FXML
  public void onRedoButton(ActionEvent event) {

  }

  @FXML
  public void onCopyButton(ActionEvent event) {

  }

  @FXML
  public void onConsoleButton(ActionEvent event) {

  }

  @FXML
  public void onBugReport(ActionEvent event) {

  }

  @FXML
  public void onHelpButton(ActionEvent event) {

  }

  @FXML
  public void onSearchButton(ActionEvent event) {

  }
}
