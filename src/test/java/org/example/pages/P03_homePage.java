package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class P03_homePage {
    public P03_homePage()
    {
        PageFactory.initElements(Hooks.driver,this);
    }
    @FindBy(css = "select[id=\"customerCurrency\"]")
    public WebElement currencydroplist;

    @FindBy(css = "span[class=\"price actual-price\"]")
    public List<WebElement> productprices;
    @FindBy(css = "input[class=\"search-box-text ui-autocomplete-input\"]")
    public WebElement srchfield ;
    @FindBy(css = "button[type=\"submit\"]")
    public WebElement srchbtn;
    @FindBy(css = "h2[class=\"product-title\"]")
    public List<WebElement> producttitles;
    @FindBy(css = "div[class=\"picture\"]")
    public WebElement srchedprdct;
    @FindBy(css = "div[class=\"sku\"] span[class=\"value\"]")
    public WebElement sku;
    @FindBy(css = "ul[class=\"top-menu notmobile\"] a[href=\"/computers\"]")
    public WebElement compcatg;
    @FindBy(css = "ul[class=\"sublist first-level\"] a[href=\"/desktops\"]")
    public WebElement dsktopsbctg;
    @FindBy(css = "div[class=\"page-title\"] h1")
    public WebElement dsktoptitle;
    @FindBy(css = "a[href=\"https://demo.nopcommerce.com/\"]")
    public WebElement homeslider1;
    @FindBy(css = "a[style=\"display: block;\"]")
    public WebElement homeslider2;
    @FindBy(css = "a[href=\"http://www.facebook.com/nopCommerce\"]")
    public WebElement facebookicon;
    @FindBy(css = "a[href=\"https://twitter.com/nopCommerce\"]")
    public WebElement twittericon;
    @FindBy(css = "a[href=\"/news/rss/1\"]")
    public WebElement rssicon;
    @FindBy(css = "a[href=\"http://www.youtube.com/user/nopCommerce\"]")
    public WebElement youtubeicon;
    @FindBy(css = "div[data-productid=\"18\"] button[class=\"button-2 add-to-wishlist-button\"]")
    public WebElement htcwishlistbtn;
    @FindBy(css = "div[class=\"bar-notification success\"]")
    public WebElement wishlstsucssmesg;
    @FindBy(css = "div[class=\"header-links\"] a[href=\"/wishlist\"]")
    public WebElement wishlistlink;
    @FindBy(css = "input[class=\"qty-input\"]")
    public WebElement prdctQTY;

}
