package io.fabric8;

import io.fabric8.kubernetes.api.model.Config;
import io.fabric8.kubernetes.client.internal.KubeConfigUtils;

import java.io.File;
import java.io.IOException;

public class LoadAndModifyKubeConfig {
  public void loadAndModify() throws IOException {
    File kubeConfigFile = new File("/home/rokumar/.kube/config");
    Config config = KubeConfigUtils.parseConfig(kubeConfigFile);
    System.out.println("Current context: " + config.getCurrentContext());
    config.setCurrentContext("somethingelse");
    KubeConfigUtils.persistKubeConfigIntoFile(config, kubeConfigFile.getAbsolutePath());
  }
}
