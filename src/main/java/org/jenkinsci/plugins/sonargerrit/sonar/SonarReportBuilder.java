package org.jenkinsci.plugins.sonargerrit.sonar;

import com.google.gson.*;
import java.util.Date;
import org.kohsuke.accmod.Restricted;
import org.kohsuke.accmod.restrictions.NoExternalUse;

/** Project: Sonar-Gerrit Plugin Author: Tatiana Didik */
@Restricted(NoExternalUse.class)
class SonarReportBuilder {
  private final Gson gson =
      new GsonBuilder().registerTypeAdapter(Date.class, new DateTypeConverter()).create();

  public ReportRepresentation fromJson(String json) {
    return gson.fromJson(json, ReportRepresentation.class);
  }
}
