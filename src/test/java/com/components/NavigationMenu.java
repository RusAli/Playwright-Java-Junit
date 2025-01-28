package com.components;

import com.microsoft.playwright.Page;

public class NavigationMenu extends BaseComponent {

  public NavigationMenu(Page page) {
    super(page);
  }

  public void clickOnLogout() {
    page.click("#logout_sidebar_link");
  }
}
