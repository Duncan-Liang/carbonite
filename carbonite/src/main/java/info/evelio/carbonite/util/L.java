/*
 * Copyright 2013 Evelio Tarazona Cáceres <evelio@evelio.info>
 * Copyright 2013 Carbonite contributors <contributors@evelio.info>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package info.evelio.carbonite.util;

import android.util.Log;

/**
 * @hide
 */
public final class L {
  private static boolean sLogEnabled = true;

  private L() {
    // No instances baby!
  }

  public static void e(String tag, String msg, Throwable tr) {
    if (sLogEnabled) {
      Log.e(tag, msg, tr);
    }
  }

  public static void setLogEnabled(boolean logEnabled) {
    sLogEnabled = logEnabled;
  }
}
