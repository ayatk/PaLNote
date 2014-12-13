/*
 * PaLNote
 * http://palnote.org
 *
 * Copyright (c) 2014 Ayana Tokikaze. All rights reserved.
 * 　Released under the Apache v2 License.
 *
 * Created by Ayana Tokikaze on 14/10/14.
 */
package net.snvx.palnote.core.io;

import java.io.File;
import java.io.IOException;

public class Files {
  public void NewFile(String dir, String newFileName) {
    File file = new File(dir + newFileName);
    try {
      if (!file.createNewFile()) {
      }
    } catch (IOException e) {

    }
  }

  public void deleteFile() {

  }

  public void createNewDirectory(String newDirectoryName) {

  }

  public void saveFile(String FileName) {

  }
}