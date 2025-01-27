package com.pages;

import com.microsoft.playwright.Page;

import static com.config.ConfigManager.config;

public abstract class BasePage {
  protected Page page;

  public void setAndConfigPage(final Page page) {
    this.page = page;
    page.setDefaultTimeout(config().timeout());
  }

  public void initComponents() {
  }

}
