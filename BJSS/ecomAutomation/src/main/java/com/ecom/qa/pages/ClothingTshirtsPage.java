package com.ecom.qa.pages;

import com.ecom.qa.base.TestBase;

import java.util.Map;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ClothingTshirtsPage extends TestBase{
    private WebDriver driver;

    @FindBy(css = "#informations_block_left_1 div.block_content.list-block ul li:nth-of-type(4) a")
    @CacheLookup
    private WebElement aboutUs1;

    @FindBy(css = "#block_various_links_footer ul.toggle-footer li:nth-of-type(7) a")
    @CacheLookup
    private WebElement aboutUs2;

    @FindBy(css = "a.button.ajax_add_to_cart_button.btn.btn-default")
    @CacheLookup
    private WebElement addToCart;

    @FindBy(css = "a.add_to_compare")
    @CacheLookup
    private WebElement addToCompare;

    @FindBy(css = "a.addToWishlist.wishlistProd_1")
    @CacheLookup
    private WebElement addToWishlist;

    @FindBy(css = "a[title='All specials']")
    @CacheLookup
    private WebElement allSpecials;

    @FindBy(css = "a[title='Best sellers']")
    @CacheLookup
    private WebElement bestSellers;

    @FindBy(css = "#header div:nth-of-type(3) div.container div.row div:nth-of-type(3) div.shopping_cart div.cart_block.block.exclusive div.block_content div.cart_block_list dl.products dt:nth-of-type(1) div.cart-info div:nth-of-type(2) a")
    @CacheLookup
    private WebElement blackS;

    @FindBy(css = "a[href='http://automationpractice.com/index.php?id_product=2&controller=product']")
    @CacheLookup
    private WebElement blouse1;

    @FindBy(css = "#header div:nth-of-type(3) div.container div.row div:nth-of-type(3) div.shopping_cart div.cart_block.block.exclusive div.block_content div.cart_block_list dl.products dt:nth-of-type(1) div.cart-info div:nth-of-type(1) a.cart_block_product_name")
    @CacheLookup
    private WebElement blouse2;

    @FindBy(css = "a[title='Blouses']")
    @CacheLookup
    private WebElement blouses1;

    @FindBy(css = "a[title='Match your favorites blouses with the right accessories for the perfect look.']")
    @CacheLookup
    private WebElement blouses2;

    @FindBy(id = "layered_id_attribute_group_14")
    @CacheLookup
    private WebElement blue11;

    @FindBy(css = "a[href='http://automationpractice.com/index.php?id_category=5&controller=category#color-blue']")
    @CacheLookup
    private WebElement blue12;

    @FindBy(css = "a[title='View my shopping cart']")
    @CacheLookup
    private WebElement cart2ProductProducts4340;

    @FindBy(id = "layered_id_feature_11")
    @CacheLookup
    private WebElement casual11;

    @FindBy(css = "a[href='http://automationpractice.com/index.php?id_category=5&controller=category#styles-casual']")
    @CacheLookup
    private WebElement casual12;

    @FindBy(css = "#block_top_menu ul.sf-menu.clearfix.menu-content.sf-js-enabled.sf-arrows li:nth-of-type(1) ul.submenu-container.clearfix.first-in-line-xs li:nth-of-type(2) ul li:nth-of-type(1) a")
    @CacheLookup
    private WebElement casualDresses1;

    @FindBy(css = "#block_top_menu ul.sf-menu.clearfix.menu-content.sf-js-enabled.sf-arrows li:nth-of-type(2) ul.submenu-container.clearfix.first-in-line-xs li:nth-of-type(1) a")
    @CacheLookup
    private WebElement casualDresses2;

    @FindBy(css = "#footer div.row section:nth-of-type(2) div.category_footer.toggle-footer div.list ul.tree.dynamized li.last ul li:nth-of-type(2) ul li:nth-of-type(1) a")
    @CacheLookup
    private WebElement casualDresses3;

    @FindBy(id = "button_order_cart")
    @CacheLookup
    private WebElement checkOut;

    @FindBy(css = "#center_column div:nth-of-type(2) div:nth-of-type(2) form.compare-form button.btn.btn-default.button.button-medium.bt_compare.bt_compare")
    @CacheLookup
    private WebElement compare01;

    @FindBy(css = "button.btn.btn-default.button.button-medium.bt_compare.bt_compare_bottom")
    @CacheLookup
    private WebElement compare02;

    @FindBy(css = "a[title='Contact Us']")
    @CacheLookup
    private WebElement contactUs1;

    @FindBy(css = "a[title='Contact us']")
    @CacheLookup
    private WebElement contactUs2;

    @FindBy(id = "layered_id_feature_5")
    @CacheLookup
    private WebElement cotton11;

    @FindBy(css = "a[href='http://automationpractice.com/index.php?id_category=5&controller=category#compositions-cotton']")
    @CacheLookup
    private WebElement cotton12;

    @FindBy(css = "a[title='Delivery']")
    @CacheLookup
    private WebElement delivery;

    @FindBy(css = "#stores_block_left div.block_content.blockstore div a.btn.btn-default.button.button-small")
    @CacheLookup
    private WebElement discoverOurStores;

    @FindBy(css = "#block_top_menu ul.sf-menu.clearfix.menu-content.sf-js-enabled.sf-arrows li:nth-of-type(1) ul.submenu-container.clearfix.first-in-line-xs li:nth-of-type(2) a.sf-with-ul")
    @CacheLookup
    private WebElement dresses1;

    @FindBy(css = "#block_top_menu ul.sf-menu.clearfix.menu-content.sf-js-enabled.sf-arrows li:nth-of-type(2) a.sf-with-ul")
    @CacheLookup
    private WebElement dresses2;

    @FindBy(css = "#footer div.row section:nth-of-type(2) div.category_footer.toggle-footer div.list ul.tree.dynamized li.last ul li:nth-of-type(2) a")
    @CacheLookup
    private WebElement dresses3;

    @FindBy(css = "a._blank")
    @CacheLookup
    private WebElement ecommerceSoftwareByPrestashop;

    @FindBy(id = "newsletter-input")
    @CacheLookup
    private WebElement ecommerceSoftwareByPrestashop2014;

    @FindBy(css = "#block_top_menu ul.sf-menu.clearfix.menu-content.sf-js-enabled.sf-arrows li:nth-of-type(1) ul.submenu-container.clearfix.first-in-line-xs li:nth-of-type(2) ul li:nth-of-type(2) a")
    @CacheLookup
    private WebElement eveningDresses1;

    @FindBy(css = "#block_top_menu ul.sf-menu.clearfix.menu-content.sf-js-enabled.sf-arrows li:nth-of-type(2) ul.submenu-container.clearfix.first-in-line-xs li:nth-of-type(2) a")
    @CacheLookup
    private WebElement eveningDresses2;

    @FindBy(css = "a[title='Browse our different dresses to choose the perfect dress for an unforgettable evening!']")
    @CacheLookup
    private WebElement eveningDresses3;

    @FindBy(css = "a[href='https://www.facebook.com/groups/525066904174158/']")
    @CacheLookup
    private WebElement facebook;

    @FindBy(css = "#center_column ul.product_list.grid.row li.ajax_block_product.col-xs-12.col-sm-6.col-md-4.first-in-line.last-line.first-item-of-tablet-line.first-item-of-mobile-line.last-mobile-line div.product-container div:nth-of-type(2) h5 a.product-name")
    @CacheLookup
    private WebElement fadedShortSleeveTshirts;

    @FindBy(id = "layered_manufacturer_1")
    @CacheLookup
    private WebElement fashionManufacturer11;

    @FindBy(css = "a[href='http://automationpractice.com/index.php?id_category=5&controller=category#manufacturer-fashion_manufacturer']")
    @CacheLookup
    private WebElement fashionManufacturer12;

    @FindBy(css = "a[href='https://plus.google.com/111979135243110831526/posts']")
    @CacheLookup
    private WebElement googlePlus;

    @FindBy(css = "a[title='Grid']")
    @CacheLookup
    private WebElement grid;

    @FindBy(id = "layered_quantity_1")
    @CacheLookup
    private WebElement inStock11;

    @FindBy(css = "a[href='http://automationpractice.com/index.php?id_category=5&controller=category#availability-in_stock']")
    @CacheLookup
    private WebElement inStock12;

    @FindBy(css = "a[href='http://automationpractice.com/index.php?id_cms_category=1&controller=cms']")
    @CacheLookup
    private WebElement information;

    @FindBy(id = "layered_id_attribute_group_3")
    @CacheLookup
    private WebElement l11;

    @FindBy(css = "a[href='http://automationpractice.com/index.php?id_category=5&controller=category#size-l']")
    @CacheLookup
    private WebElement l12;

    @FindBy(css = "a[title='Legal Notice']")
    @CacheLookup
    private WebElement legalNotice;

    @FindBy(css = "a[title='List']")
    @CacheLookup
    private WebElement list;

    @FindBy(id = "layered_id_attribute_group_2")
    @CacheLookup
    private WebElement m11;

    @FindBy(css = "a[href='http://automationpractice.com/index.php?id_category=5&controller=category#size-m']")
    @CacheLookup
    private WebElement m12;

    @FindBy(css = "a.button.lnk_view.btn.btn-default")
    @CacheLookup
    private WebElement more;

    @FindBy(css = "a[title='Manage my customer account']")
    @CacheLookup
    private WebElement myAccount;

    @FindBy(css = "a[title='My addresses']")
    @CacheLookup
    private WebElement myAddresses;

    @FindBy(css = "a[title='My credit slips']")
    @CacheLookup
    private WebElement myCreditSlips;

    @FindBy(css = "a[title='My orders']")
    @CacheLookup
    private WebElement myOrders;

    @FindBy(css = "a[title='Manage my personal information']")
    @CacheLookup
    private WebElement myPersonalInfo;

    @FindBy(id = "layered_condition_new")
    @CacheLookup
    private WebElement new11;

    @FindBy(css = "a[href='http://automationpractice.com/index.php?id_category=5&controller=category#condition-new']")
    @CacheLookup
    private WebElement new12;

    @FindBy(css = "a[title='New products']")
    @CacheLookup
    private WebElement newProducts;

    @FindBy(name = "submitNewsletter")
    @CacheLookup
    private WebElement ok;

    @FindBy(id = "layered_id_attribute_group_13")
    @CacheLookup
    private WebElement orange11;

    @FindBy(css = "a[href='http://automationpractice.com/index.php?id_category=5&controller=category#color-orange']")
    @CacheLookup
    private WebElement orange12;

    @FindBy(css = "#informations_block_left_1 div.block_content.list-block ul li:nth-of-type(6) a")
    @CacheLookup
    private WebElement ourStores1;

    @FindBy(css = "#stores_block_left p.title_block a")
    @CacheLookup
    private WebElement ourStores2;

    @FindBy(css = "#block_various_links_footer ul.toggle-footer li:nth-of-type(4) a")
    @CacheLookup
    private WebElement ourStores3;

    @FindBy(css = "#header div:nth-of-type(3) div.container div.row div:nth-of-type(3) div.shopping_cart div.cart_block.block.exclusive div.block_content div.cart_block_list dl.products dt:nth-of-type(2) div.cart-info div:nth-of-type(1) a.cart_block_product_name")
    @CacheLookup
    private WebElement printed;

    @FindBy(css = "#header div:nth-of-type(3) div.container div.row div:nth-of-type(3) div.shopping_cart div.cart_block.block.exclusive div.block_content div.cart_block_list dl.products dt:nth-of-type(2) a.cart-images")
    @CacheLookup
    private WebElement printedChiffonDress1;

    @FindBy(css = "#special_block_right div.block_content.products-block ul li.clearfix div.product-content h5 a.product-name")
    @CacheLookup
    private WebElement printedChiffonDress2;

    @FindBy(css = "#viewed-products_block_left div.block_content.products-block ul li.clearfix.last_item div.product-content h5 a.product-name")
    @CacheLookup
    private WebElement printedChiffonDress3;

    @FindBy(css = "a.btn.btn-default.button.button-medium")
    @CacheLookup
    private WebElement proceedToCheckout;

    @FindBy(id = "search_query_top")
    @CacheLookup
    private WebElement productSuccessfullyAddedToYourShopping;

    @FindBy(css = "a.quick-view")
    @CacheLookup
    private WebElement quickView;

    @FindBy(id = "layered_id_attribute_group_1")
    @CacheLookup
    private WebElement s11;

    @FindBy(css = "a[href='http://automationpractice.com/index.php?id_category=5&controller=category#size-s']")
    @CacheLookup
    private WebElement s12;

    @FindBy(name = "submit_search")
    @CacheLookup
    private WebElement search;

    @FindBy(css = "a[title='Secure payment']")
    @CacheLookup
    private WebElement securePayment;

    @FindBy(id = "layered_id_feature_17")
    @CacheLookup
    private WebElement shortSleeve11;

    @FindBy(css = "a[href='http://automationpractice.com/index.php?id_category=5&controller=category#properties-short_sleeve']")
    @CacheLookup
    private WebElement shortSleeve12;

    @FindBy(css = "a.login")
    @CacheLookup
    private WebElement signIn;

    @FindBy(css = "a[title='Sitemap']")
    @CacheLookup
    private WebElement sitemap;

    @FindBy(id = "selectProductSort")
    @CacheLookup
    private WebElement sortBy;

    @FindBy(css = "#special_block_right p.title_block a")
    @CacheLookup
    private WebElement specials1;

    @FindBy(css = "#block_various_links_footer ul.toggle-footer li:nth-of-type(1) a")
    @CacheLookup
    private WebElement specials2;

    @FindBy(css = "#block_top_menu ul.sf-menu.clearfix.menu-content.sf-js-enabled.sf-arrows li:nth-of-type(1) ul.submenu-container.clearfix.first-in-line-xs li:nth-of-type(2) ul li:nth-of-type(3) a")
    @CacheLookup
    private WebElement summerDresses1;

    @FindBy(css = "#block_top_menu ul.sf-menu.clearfix.menu-content.sf-js-enabled.sf-arrows li:nth-of-type(2) ul.submenu-container.clearfix.first-in-line-xs li:nth-of-type(3) a")
    @CacheLookup
    private WebElement summerDresses2;

    @FindBy(css = "a[title='Short dress, long dress, silk dress, printed dress, you will find the perfect dress for summer.']")
    @CacheLookup
    private WebElement summerDresses3;

    @FindBy(css = "a[href='mailto:%73%75%70%70%6f%72%74@%73%65%6c%65%6e%69%75%6d%66%72%61%6d%65%77%6f%72%6b.%63%6f%6d']")
    @CacheLookup
    private WebElement supportseleniumframeworkCom;

    @FindBy(css = "#informations_block_left_1 div.block_content.list-block ul li:nth-of-type(3) a")
    @CacheLookup
    private WebElement termsAndConditionsOfUse1;

    @FindBy(css = "#block_various_links_footer ul.toggle-footer li:nth-of-type(6) a")
    @CacheLookup
    private WebElement termsAndConditionsOfUse2;

    @FindBy(css = "#block_top_menu ul.sf-menu.clearfix.menu-content.sf-js-enabled.sf-arrows li:nth-of-type(1) ul.submenu-container.clearfix.first-in-line-xs li:nth-of-type(1) a.sf-with-ul")
    @CacheLookup
    private WebElement tops1;

    @FindBy(css = "#columns div:nth-of-type(1) a:nth-of-type(3)")
    @CacheLookup
    private WebElement tops2;

    @FindBy(css = "#footer div.row section:nth-of-type(2) div.category_footer.toggle-footer div.list ul.tree.dynamized li.last ul li:nth-of-type(1) a")
    @CacheLookup
    private WebElement tops3;

    @FindBy(css = "#block_top_menu ul.sf-menu.clearfix.menu-content.sf-js-enabled.sf-arrows li:nth-of-type(1) ul.submenu-container.clearfix.first-in-line-xs li:nth-of-type(1) ul li:nth-of-type(1) a")
    @CacheLookup
    private WebElement tshirts1;

    @FindBy(css = "#block_top_menu ul.sf-menu.clearfix.menu-content.sf-js-enabled.sf-arrows li:nth-of-type(3) a")
    @CacheLookup
    private WebElement tshirts2;

    @FindBy(css = "a.selected")
    @CacheLookup
    private WebElement tshirts3;

    @FindBy(css = "a[href='https://twitter.com/seleniumfrmwrk']")
    @CacheLookup
    private WebElement twitter;

    @FindBy(css = "#block_top_menu ul.sf-menu.clearfix.menu-content.sf-js-enabled.sf-arrows li:nth-of-type(1) a.sf-with-ul")
    @CacheLookup
    private WebElement women1;

    @FindBy(css = "#columns div:nth-of-type(1) a:nth-of-type(2)")
    @CacheLookup
    private WebElement women2;

    @FindBy(css = "#footer div.row section:nth-of-type(2) div.category_footer.toggle-footer div.list ul.tree.dynamized li.last a")
    @CacheLookup
    private WebElement women3;

    @FindBy(css = "#header div:nth-of-type(3) div.container div.row div:nth-of-type(3) div.shopping_cart div.cart_block.block.exclusive div.block_content div.cart_block_list dl.products dt:nth-of-type(2) div.cart-info div:nth-of-type(2) a")
    @CacheLookup
    private WebElement yellowS;

    @FindBy(css = "a[href='https://www.youtube.com/channel/UCHl59sI3SRjQ-qPcTrgt0tA']")
    @CacheLookup
    private WebElement youtube;


    //Page Objects Initialised 
    public ClothingTshirtsPage() {
    }

    public ClothingTshirtsPage(WebDriver driver) {
        this();
        this.driver = driver;
    }

    public ClothingTshirtsPage(WebDriver driver, Map<String, String> data) {
        this(driver);
    }

    public ClothingTshirtsPage(WebDriver driver, Map<String, String> data, int timeout) {
        this(driver, data);
    }

    
    //Actions
    public String validateClothingTshirtsPageTitle() {
    	return driver.getTitle();
    }
    
}
