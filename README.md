# bjssAutomation
Automation challenge attempted by Lee Crossley
Quick high level one liner......

I would suggest postponing the release of this to live until we sort out some (preferably all) of the issues mentioned below, as it could have a more damaging impact to business releasing this over releasing nothing (in which time we can market the site or research future tech further to fill the release void created by not releasing).
 
*****************************************************************************************************************************************************************************************************************************************************************************
   
Detailed description below

*****************************************************************************************************************************************************************************************************************************************************************************
 
Approach taken

Page Object Model Design Pattern (easy to maintain, readable format & reusable scripts)
 
 UI Automation
 - Selenium/Java
 
 Browsers
 - Chrome
 
 Image recognition
 - Native Selenium code was proposed for image recognition.
 
 API Testing
 - Java core httpURLConnection for API calls.
 
 Assertions
 - TestNG
 
 Parallel execution
 - TestNG (would be preferred)
 
 Reporting
 - TestNG
 
*****************************************************************************************************************************************************************************************************************************************************************************
 
General Notes
 
Usually env variables will be used for commercial work in relation to usernames and passwords etc but I went with hard coded to make it easier to transport.
 
Potential scaling opportunities
- For parallel automation (multi-browser) that integrates with Docker/Kubernetes and handles dependencies and version'ing efficiently.
- https://github.com/zalando/zalenium 
 
Potential Service Virtualisation opportunities
- Create mocked services for greater test coverage and eradicating down-time for areas with intermittent/shared or not fit for purpose services.
- https://github.com/Raathigesh/atmo
 
Potential Accessability/SEO testing opportunities (aids UI Automation)
- Asqatasun is the leading opensource software for web accessibility (#a11y) since 2007. Built with reliability in mind, it also addresses SEO concerns, and is extensible to any other domain.
- Asqatasun provides a huge level of automation and can be included in Continuous Integration thanks to its Jenkins Plugin.
- https://github.com/Asqatasun/Asqatasun
 
*****************************************************************************************************************************************************************************************************************************************************************************
 
 Issues  
 
 UX (Critical)
 1 - Upon first, second and third login attempt (exploratory session), Error (badly handled) -  Link to database cannot be established: SQLSTATE[HY000] [1203] User automa37_pr595 already has more than 'max_user_connections' active connections)
 2 - There is no Shoes section (even though they are advertised)
 3 - Linkless images on Womens section drop down
 4 - Shop Now button on the home page takes you to the Presta Shop site
 
*****************************************************************************************************************************************************************************************************************************************************************************
 
Optimisations (mobile)
 
Eliminate render-blocking JavaScript and CSS in above-the-fold content

Your page has 1 blocking CSS resources. This causes a delay in rendering your page.

None of the above-the-fold content on your page could be rendered without waiting for the following resources to load. Try to defer or asynchronously load blocking resources, or inline the critical portions of those resources directly in the HTML.

Optimise CSS Delivery of the following:
- http://automationpractice.com/themes/default-bootstrap/css/global.css

Leverage browser caching
- Setting an expiry date or a maximum age in the HTTP headers for static resources instructs the browser to load previously downloaded resources from local disk rather than over the network.

Leverage browser caching for the following cacheable resources:
- http://automationpractice.com/img/c/3-0_thumb.jpg (expiration not specified)
- http://automationpractice.com/img/c/3-1_thumb.jpg (expiration not specified)
- http://automationpractice.com/img/logo.jpg (expiration not specified)
- http://automationpractice.com/img/p/1/0/10-home_default.jpg (expiration not specified)
- http://automationpractice.com/img/p/1/1-home_default.jpg (expiration not specified)
- http://automationpractice.com/img/p/1/2/12-home_default.jpg (expiration not specified)
- http://automationpractice.com/img/p/1/6/16-home_default.jpg (expiration not specified)
- http://automationpractice.com/img/p/2/0/20-home_default.jpg (expiration not specified)
- http://automationpractice.com/img/p/7/7-home_default.jpg (expiration not specified)
- http://automationpractice.com/img/p/8/8-home_default.jpg (expiration not specified)
- http://automationpractice.com/js/jquery/jquery-1.11.0.min.js (expiration not specified)
- http://automationpractice.com/js/jquery/jquery-migrate-1.2.1.min.js (expiration not specified)
- http://automationpractice.com/…ins/autocomplete/jquery.autocomplete.css (expiration not specified)
- http://automationpractice.com/…gins/autocomplete/jquery.autocomplete.js (expiration not specified)
- http://automationpractice.com/…uery/plugins/bxslider/jquery.bxslider.js (expiration not specified)
- http://automationpractice.com/…ery/plugins/fancybox/jquery.fancybox.css (expiration not specified)
- http://automationpractice.com/…uery/plugins/fancybox/jquery.fancybox.js (expiration not specified)
- http://automationpractice.com/js/jquery/plugins/jquery.easing.js (expiration not specified)
- http://automationpractice.com/js/jquery/plugins/jquery.scrollTo.js (expiration not specified)
- http://automationpractice.com/…js/jquery/plugins/jquery.serialScroll.js (expiration not specified)
- http://automationpractice.com/js/tools.js (expiration not specified)
- http://automationpractice.com/modules/blockfacebook/blockfacebook.js (expiration not specified)
- http://automationpractice.com/…ules/blockfacebook/css/blockfacebook.css (expiration not specified)
- http://automationpractice.com/modules/editorial/css/editorial.css (expiration not specified)
- http://automationpractice.com/modules/themeconfigurator/css/hooks.css (expiration not specified)
- http://automationpractice.com/…es/themeconfigurator/img/banner-img1.jpg (expiration not specified)
- http://automationpractice.com/…es/themeconfigurator/img/banner-img2.jpg (expiration not specified)
- http://automationpractice.com/…es/themeconfigurator/img/banner-img3.jpg (expiration not specified)
- http://automationpractice.com/…es/themeconfigurator/img/banner-img4.jpg (expiration not specified)
- http://automationpractice.com/…es/themeconfigurator/img/banner-img5.jpg (expiration not specified)
- http://automationpractice.com/…es/themeconfigurator/img/banner-img6.jpg (expiration not specified)
- http://automationpractice.com/…es/themeconfigurator/img/banner-img7.jpg (expiration not specified)
- http://automationpractice.com/…fault-bootstrap/css/autoload/highdpi.css (expiration not specified)
- http://automationpractice.com/…strap/css/autoload/responsive-tables.css (expiration not specified)
- http://automationpractice.com/…otstrap/css/autoload/uniform.default.css (expiration not specified)
- http://automationpractice.com/themes/default-bootstrap/css/global.css (expiration not specified)
- http://automationpractice.com/…trap/css/modules/blockcart/blockcart.css (expiration not specified)
- http://automationpractice.com/…ules/blockcategories/blockcategories.css (expiration not specified)
- http://automationpractice.com/…ss/modules/blockcontact/blockcontact.css (expiration not specified)
- http://automationpractice.com/…ules/blockcurrencies/blockcurrencies.css (expiration not specified)
- http://automationpractice.com/…odules/blocklanguages/blocklanguages.css (expiration not specified)
- http://automationpractice.com/…ules/blocknewsletter/blocknewsletter.css (expiration not specified)
- http://automationpractice.com/…/css/modules/blocksearch/blocksearch.css (expiration not specified)
- http://automationpractice.com/…trap/css/modules/blocktags/blocktags.css (expiration not specified)
- http://automationpractice.com/…odules/blocktopmenu/css/blocktopmenu.css (expiration not specified)
- http://automationpractice.com/…/blocktopmenu/css/superfish-modified.css (expiration not specified)
- http://automationpractice.com/…/modules/blockuserinfo/blockuserinfo.css (expiration not specified)
- http://automationpractice.com/…/css/modules/blockviewed/blockviewed.css (expiration not specified)
- http://automationpractice.com/…/modules/blockwishlist/blockwishlist.css (expiration not specified)
- http://automationpractice.com/…ules/productcomments/productcomments.css (expiration not specified)
- http://automationpractice.com/…s/default-bootstrap/css/product_list.css (expiration not specified)
- http://automationpractice.com/themes/default-bootstrap/img/bg_bt.gif (expiration not specified)
- http://automationpractice.com/…ult-bootstrap/img/price-container-bg.png (expiration not specified)
- http://automationpractice.com/…ootstrap/js/autoload/10-bootstrap.min.js (expiration not specified)
- http://automationpractice.com/…/autoload/15-jquery.total-storage.min.js (expiration not specified)
- http://automationpractice.com/…s/autoload/15-jquery.uniform-modified.js (expiration not specified)
- http://automationpractice.com/themes/default-bootstrap/js/global.js (expiration not specified)
- http://automationpractice.com/themes/default-bootstrap/js/index.js (expiration not specified)
- http://automationpractice.com/…tstrap/js/modules/blockcart/ajax-cart.js (expiration not specified)
- http://automationpractice.com/…dules/blocknewsletter/blocknewsletter.js (expiration not specified)
- http://automationpractice.com/…ap/js/modules/blocksearch/blocksearch.js (expiration not specified)
- http://automationpractice.com/…/modules/blocktopmenu/js/blocktopmenu.js (expiration not specified)
- http://automationpractice.com/…s/modules/blocktopmenu/js/hoverIntent.js (expiration not specified)
- http://automationpractice.com/…es/blocktopmenu/js/superfish-modified.js (expiration not specified)
- http://automationpractice.com/…odules/blockwishlist/js/ajax-wishlist.js (expiration not specified)
- http://automationpractice.com/…ault-bootstrap/js/products-comparison.js (expiration not specified)
- http://automationpractice.com/…ult-bootstrap/js/tools/treeManagement.js (expiration not specified)
- http://connect.facebook.net/en_US/all.js (20 minutes)

Reduce server response time
In my test, your server responded in 0.30 seconds. There are many factors included here that can slow down your server response time. 

Enable compression
- Compressing resources with gzip or deflate can reduce the number of bytes sent over the network.

Enable compression for the following resources to reduce their transfer size by 449.6KiB (78% reduction).
- Compressing http://automationpractice.com/themes/default-bootstrap/css/global.css could save 173.5KiB (84% reduction).
- Compressing http://automationpractice.com/index.php could save 67.3KiB (88% reduction).
- Compressing http://automationpractice.com/js/jquery/jquery-1.11.0.min.js could save 61.5KiB (65% reduction).
- Compressing http://automationpractice.com/…s/autoload/15-jquery.uniform-modified.js could save 27.8KiB (78% reduction).
- Compressing http://automationpractice.com/…tstrap/js/modules/blockcart/ajax-cart.js could save 22.8KiB (75% reduction).
- Compressing http://automationpractice.com/…ootstrap/js/autoload/10-bootstrap.min.js could save 19.9KiB (73% reduction).
- Compressing http://automationpractice.com/…uery/plugins/fancybox/jquery.fancybox.js could save 14.2KiB (62% reduction).
- Compressing http://automationpractice.com/…uery/plugins/bxslider/jquery.bxslider.js could save 13.7KiB (73% reduction).
- Compressing http://automationpractice.com/…s/default-bootstrap/css/product_list.css could save 13.4KiB (84% reduction).
- Compressing http://automationpractice.com/…gins/autocomplete/jquery.autocomplete.js could save 13.2KiB (67% reduction).
- Compressing http://automationpractice.com/…trap/css/modules/blockcart/blockcart.css could save 11.3KiB (80% reduction).
- Compressing http://automationpractice.com/js/tools.js could save 11KiB (67% reduction).

Minify CSS
Compacting CSS code can save many bytes of data and speed up download and parse times.

Minify CSS for the following resources to reduce their size by 33.7KiB (17% reduction).
- Minifying http://automationpractice.com/themes/default-bootstrap/css/global.css could save 33.7KiB (17% reduction).

Minify HTML
Compacting HTML code, including any inline JavaScript and CSS contained in it, can save many bytes of data and speed up download and parse times.

Minify HTML for the following resources to reduce their size by 15.8KiB (21% reduction).
- Minifying http://automationpractice.com/index.php could save 15.8KiB (21% reduction).

Minify JavaScript
Compacting JavaScript code can save many bytes of data and speed up downloading, parsing, and execution time.

Minify JavaScript for the following resources to reduce their size by 22.6KiB (63% reduction).
- Minifying http://automationpractice.com/…s/autoload/15-jquery.uniform-modified.js could save 22.6KiB (63% reduction).

To summarise (for mobile), google scores your site at 80/100 in relation to optimisation (with average scoring for page speed) which is within the appropriate score to be considered relevant using googles search algorithm.

*****************************************************************************************************************************************************************************************************************************************************************************

Optimisation Suggestions (Desktop)

Enable compression
Compressing resources with gzip or deflate can reduce the number of bytes sent over the network.

Enable compression for the following resources to reduce their transfer size by 542.8KiB (76% reduction).
- Compressing http://automationpractice.com/themes/default-bootstrap/css/global.css could save 173.5KiB (84% reduction).
- Compressing http://automationpractice.com/index.php could save 70.3KiB (88% reduction).
- Compressing http://automationpractice.com/js/jquery/jquery-1.11.0.min.js could save 61.5KiB (65% reduction).
- Compressing http://automationpractice.com/…s/autoload/15-jquery.uniform-modified.js could save 27.8KiB (78% reduction).
- Compressing http://automationpractice.com/…tstrap/js/modules/blockcart/ajax-cart.js could save 22.8KiB (75% reduction).
- Compressing http://automationpractice.com/…ootstrap/js/autoload/10-bootstrap.min.js could save 19.9KiB (73% reduction).
- Compressing http://automationpractice.com/…uery/plugins/fancybox/jquery.fancybox.js could save 14.2KiB (62% reduction).
- Compressing http://automationpractice.com/…uery/plugins/bxslider/jquery.bxslider.js could save 13.7KiB (73% reduction).
- Compressing http://automationpractice.com/…s/default-bootstrap/css/product_list.css could save 13.4KiB (84% reduction).
- Compressing http://automationpractice.com/…gins/autocomplete/jquery.autocomplete.js could save 13.2KiB (67% reduction).
- Compressing http://automationpractice.com/…trap/css/modules/blockcart/blockcart.css could save 11.3KiB (80% reduction).
- Compressing http://automationpractice.com/js/tools.js could save 11KiB (67% reduction).
- Compressing http://automationpractice.com/…otstrap/css/autoload/uniform.default.css could save 9.7KiB (80% reduction).
- Compressing http://automationpractice.com/themes/default-bootstrap/js/global.js could save 9.6KiB (71% reduction).
- Compressing http://automationpractice.com/…odules/blockwishlist/js/ajax-wishlist.js could save 7.3KiB (74% reduction).
- Compressing http://automationpractice.com/…ules/productcomments/productcomments.css could save 5.7KiB (79% reduction).
- Compressing http://automationpractice.com/…ap/css/modules/homeslider/homeslider.css could save 4.9KiB (79% reduction).
- Compressing http://automationpractice.com/…es/blocktopmenu/js/superfish-modified.js could save 4.6KiB (67% reduction).
- Compressing http://automationpractice.com/js/jquery/jquery-migrate-1.2.1.min.js could save 4KiB (57% reduction).
- Compressing http://automationpractice.com/…/blocktopmenu/css/superfish-modified.css could save 4KiB (74% reduction).
- Compressing http://automationpractice.com/js/jquery/plugins/jquery.easing.js could save 3.7KiB (76% reduction).
- Compressing http://automationpractice.com/…ery/plugins/fancybox/jquery.fancybox.css could save 3.4KiB (70% reduction).
- Compressing http://automationpractice.com/…/modules/blockwishlist/blockwishlist.css could save 3.2KiB (75% reduction).
- Compressing http://automationpractice.com/…s/modules/blocktopmenu/js/hoverIntent.js could save 3.2KiB (67% reduction).
- Compressing http://automationpractice.com/…ault-bootstrap/js/products-comparison.js could save 2.8KiB (63% reduction).
- Compressing http://automationpractice.com/…/modules/blocktopmenu/js/blocktopmenu.js could save 2.3KiB (61% reduction).
- Compressing http://automationpractice.com/…ap/js/modules/blocksearch/blocksearch.js could save 2.2KiB (59% reduction).
- Compressing http://automationpractice.com/…ules/blocknewsletter/blocknewsletter.css could save 2.1KiB (72% reduction).
- Compressing http://automationpractice.com/…ules/blockcategories/blockcategories.css could save 2KiB (72% reduction).
- Compressing http://automationpractice.com/…ult-bootstrap/js/tools/treeManagement.js could save 1.8KiB (61% reduction).
- Compressing http://automationpractice.com/…/autoload/15-jquery.total-storage.min.js could save 1.5KiB (59% reduction).
- Compressing http://automationpractice.com/js/jquery/plugins/jquery.scrollTo.js could save 1.3KiB (50% reduction).
- Compressing http://automationpractice.com/…ules/blockcurrencies/blockcurrencies.css could save 1.3KiB (68% reduction).
- Compressing http://automationpractice.com/…odules/blocklanguages/blocklanguages.css could save 1.1KiB (67% reduction).
- Compressing http://automationpractice.com/…/css/modules/blocksearch/blocksearch.css could save 1KiB (65% reduction).
- Compressing http://automationpractice.com/…p/js/modules/homeslider/js/homeslider.js could save 1,014B (52% reduction).
- Compressing http://automationpractice.com/modules/themeconfigurator/css/hooks.css could save 985B (72% reduction).
- Compressing http://automationpractice.com/…js/jquery/plugins/jquery.serialScroll.js could save 968B (49% reduction).
- Compressing http://automationpractice.com/…dules/blocknewsletter/blocknewsletter.js could save 890B (51% reduction).
- Compressing http://automationpractice.com/…strap/css/autoload/responsive-tables.css could save 884B (61% reduction).
- Compressing http://automationpractice.com/…ss/modules/blockcontact/blockcontact.css could save 808B (61% reduction).
- Compressing http://automationpractice.com/modules/blockfacebook/blockfacebook.js could save 579B (44% reduction).
- Compressing http://automationpractice.com/themes/default-bootstrap/js/index.js could save 503B (46% reduction).
- Compressing http://automationpractice.com/…ins/autocomplete/jquery.autocomplete.css could save 370B (46% reduction).
- Compressing http://automationpractice.com/modules/editorial/css/editorial.css could save 291B (50% reduction).
- Compressing http://automationpractice.com/…/modules/blockuserinfo/blockuserinfo.css could save 200B (45% reduction).
- Compressing http://automationpractice.com/…fault-bootstrap/css/autoload/highdpi.css could save 157B (47% reduction).
- Compressing http://automationpractice.com/…trap/css/modules/blocktags/blocktags.css could save 154B (42% reduction).

Leverage browser caching
Setting an expiry date or a maximum age in the HTTP headers for static resources instructs the browser to load previously downloaded resources from local disk rather than over the network.

Leverage browser caching for the following cacheable resources:
- http://automationpractice.com/img/c/3-0_thumb.jpg (expiration not specified)
- http://automationpractice.com/img/c/3-1_thumb.jpg (expiration not specified)
- http://automationpractice.com/img/logo.jpg (expiration not specified)
- http://automationpractice.com/img/p/1/0/10-home_default.jpg (expiration not specified)
- http://automationpractice.com/img/p/1/1-home_default.jpg (expiration not specified)
- http://automationpractice.com/img/p/1/2/12-home_default.jpg (expiration not specified)
- http://automationpractice.com/img/p/1/6/16-home_default.jpg (expiration not specified)
- http://automationpractice.com/img/p/2/0/20-home_default.jpg (expiration not specified)
- http://automationpractice.com/img/p/7/7-home_default.jpg (expiration not specified)
- http://automationpractice.com/img/p/8/8-home_default.jpg (expiration not specified)
- http://automationpractice.com/js/jquery/jquery-1.11.0.min.js (expiration not specified)
- http://automationpractice.com/js/jquery/jquery-migrate-1.2.1.min.js (expiration not specified)
- http://automationpractice.com/…ins/autocomplete/jquery.autocomplete.css (expiration not specified)
- http://automationpractice.com/…gins/autocomplete/jquery.autocomplete.js (expiration not specified)
- http://automationpractice.com/…uery/plugins/bxslider/jquery.bxslider.js (expiration not specified)
- http://automationpractice.com/…ery/plugins/fancybox/jquery.fancybox.css (expiration not specified)
- http://automationpractice.com/…uery/plugins/fancybox/jquery.fancybox.js (expiration not specified)
- http://automationpractice.com/js/jquery/plugins/jquery.easing.js (expiration not specified)
- http://automationpractice.com/js/jquery/plugins/jquery.scrollTo.js (expiration not specified)
- http://automationpractice.com/…js/jquery/plugins/jquery.serialScroll.js (expiration not specified)
- http://automationpractice.com/js/tools.js (expiration not specified)
- http://automationpractice.com/modules/blockbanner/img/sale70.png (expiration not specified)
- http://automationpractice.com/modules/blockfacebook/blockfacebook.js (expiration not specified)
- http://automationpractice.com/…ules/blockfacebook/css/blockfacebook.css (expiration not specified)
- http://automationpractice.com/modules/editorial/css/editorial.css (expiration not specified)
- http://automationpractice.com/modules/homeslider/images/sample-1.jpg (expiration not specified)
- http://automationpractice.com/modules/homeslider/images/sample-2.jpg (expiration not specified)
- http://automationpractice.com/modules/homeslider/images/sample-3.jpg (expiration not specified)
- http://automationpractice.com/modules/themeconfigurator/css/hooks.css (expiration not specified)
- http://automationpractice.com/…es/themeconfigurator/img/banner-img1.jpg (expiration not specified)
- http://automationpractice.com/…es/themeconfigurator/img/banner-img2.jpg (expiration not specified)
- http://automationpractice.com/…es/themeconfigurator/img/banner-img3.jpg (expiration not specified)
- http://automationpractice.com/…es/themeconfigurator/img/banner-img4.jpg (expiration not specified)
- http://automationpractice.com/…es/themeconfigurator/img/banner-img5.jpg (expiration not specified)
- http://automationpractice.com/…es/themeconfigurator/img/banner-img6.jpg (expiration not specified)
- http://automationpractice.com/…es/themeconfigurator/img/banner-img7.jpg (expiration not specified)
- http://automationpractice.com/…fault-bootstrap/css/autoload/highdpi.css (expiration not specified)
- http://automationpractice.com/…strap/css/autoload/responsive-tables.css (expiration not specified)
- http://automationpractice.com/…otstrap/css/autoload/uniform.default.css (expiration not specified)
- http://automationpractice.com/themes/default-bootstrap/css/global.css (expiration not specified)
- http://automationpractice.com/…/css/modules/blockbanner/blockbanner.css (expiration not specified)
- http://automationpractice.com/…trap/css/modules/blockcart/blockcart.css (expiration not specified)
- http://automationpractice.com/…ules/blockcategories/blockcategories.css (expiration not specified)
- http://automationpractice.com/…ss/modules/blockcontact/blockcontact.css (expiration not specified)
- http://automationpractice.com/…ules/blockcurrencies/blockcurrencies.css (expiration not specified)
- http://automationpractice.com/…odules/blocklanguages/blocklanguages.css (expiration not specified)
- http://automationpractice.com/…ules/blocknewsletter/blocknewsletter.css (expiration not specified)
- http://automationpractice.com/…/css/modules/blocksearch/blocksearch.css (expiration not specified)
- http://automationpractice.com/…trap/css/modules/blocktags/blocktags.css (expiration not specified)
- http://automationpractice.com/…odules/blocktopmenu/css/blocktopmenu.css (expiration not specified)
- http://automationpractice.com/…/blocktopmenu/css/superfish-modified.css (expiration not specified)
- http://automationpractice.com/…/modules/blockuserinfo/blockuserinfo.css (expiration not specified)
- http://automationpractice.com/…/css/modules/blockviewed/blockviewed.css (expiration not specified)
- http://automationpractice.com/…/modules/blockwishlist/blockwishlist.css (expiration not specified)
- http://automationpractice.com/…ap/css/modules/homeslider/homeslider.css (expiration not specified)
- http://automationpractice.com/…/modules/homeslider/images/bx_loader.gif (expiration not specified)
- http://automationpractice.com/…ules/productcomments/productcomments.css (expiration not specified)
- http://automationpractice.com/…s/default-bootstrap/css/product_list.css (expiration not specified)
- http://automationpractice.com/…emes/default-bootstrap/img/footer-bg.png (expiration not specified)
- http://automationpractice.com/…ult-bootstrap/img/price-container-bg.png (expiration not specified)
- http://automationpractice.com/…ootstrap/js/autoload/10-bootstrap.min.js (expiration not specified)
- http://automationpractice.com/…/autoload/15-jquery.total-storage.min.js (expiration not specified)
- http://automationpractice.com/…s/autoload/15-jquery.uniform-modified.js (expiration not specified)
- http://automationpractice.com/themes/default-bootstrap/js/global.js (expiration not specified)
- http://automationpractice.com/themes/default-bootstrap/js/index.js (expiration not specified)
- http://automationpractice.com/…tstrap/js/modules/blockcart/ajax-cart.js (expiration not specified)
- http://automationpractice.com/…dules/blocknewsletter/blocknewsletter.js (expiration not specified)
- http://automationpractice.com/…ap/js/modules/blocksearch/blocksearch.js (expiration not specified)
- http://automationpractice.com/…/modules/blocktopmenu/js/blocktopmenu.js (expiration not specified)
- http://automationpractice.com/…s/modules/blocktopmenu/js/hoverIntent.js (expiration not specified)
- http://automationpractice.com/…es/blocktopmenu/js/superfish-modified.js (expiration not specified)
- http://automationpractice.com/…odules/blockwishlist/js/ajax-wishlist.js (expiration not specified)
- http://automationpractice.com/…p/js/modules/homeslider/js/homeslider.js (expiration not specified)
- http://automationpractice.com/…ault-bootstrap/js/products-comparison.js (expiration not specified)
- http://automationpractice.com/…ult-bootstrap/js/tools/treeManagement.js (expiration not specified)
- http://connect.facebook.net/en_US/all.js (20 minutes)

Optimize images
Properly formatting and compressing images can save many bytes of data.

Optimize the following images to reduce their size by 82.9KiB (17% reduction).
- Compressing http://automationpractice.com/modules/homeslider/images/sample-2.jpg could save 17KiB (17% reduction).
- Compressing http://automationpractice.com/modules/homeslider/images/sample-1.jpg could save 11.6KiB (16% reduction).
- Compressing http://automationpractice.com/modules/homeslider/images/sample-3.jpg could save 9KiB (16% reduction).
- Compressing http://automationpractice.com/…es/themeconfigurator/img/banner-img1.jpg could save 8.1KiB (19% reduction).
- Compressing http://automationpractice.com/…es/themeconfigurator/img/banner-img3.jpg could save 6.1KiB (17% reduction).
- Compressing http://automationpractice.com/…es/themeconfigurator/img/banner-img5.jpg could save 5.8KiB (18% reduction).
- Compressing http://automationpractice.com/…es/themeconfigurator/img/banner-img2.jpg could save 5.1KiB (17% reduction).
- Compressing http://automationpractice.com/…es/themeconfigurator/img/banner-img6.jpg could save 4.6KiB (17% reduction).
- Compressing http://automationpractice.com/…es/themeconfigurator/img/banner-img7.jpg could save 4.5KiB (18% reduction).
- Compressing http://automationpractice.com/img/logo.jpg could save 4.4KiB (39% reduction).
- Compressing http://automationpractice.com/…es/themeconfigurator/img/banner-img4.jpg could save 2.9KiB (17% reduction).
- Compressing http://automationpractice.com/img/c/3-0_thumb.jpg could save 1.5KiB (12% reduction).
- Compressing http://automationpractice.com/img/p/1/0/10-home_default.jpg could save 1.2KiB (12% reduction).
- Compressing http://automationpractice.com/img/p/1/2/12-home_default.jpg could save 854B (11% reduction).
- Compressing https://scontent.flux1-1.fna.fbcdn.net/…db6e7e411da79069b8fbf8bd5cc1&oe=5BB2E1F1 could save 411B (26% reduction).- 

Minify JavaScript
Compacting JavaScript code can save many bytes of data and speed up downloading, parsing, and execution time.

Minify JavaScript for the following resources to reduce their size by 67.6KiB (41% reduction).
- Minifying http://automationpractice.com/…s/autoload/15-jquery.uniform-modified.js could save 22.6KiB (63% reduction).
- Minifying http://automationpractice.com/…tstrap/js/modules/blockcart/ajax-cart.js could save 8.4KiB (28% reduction).
- Minifying http://automationpractice.com/…gins/autocomplete/jquery.autocomplete.js could save 6.8KiB (35% reduction).
- Minifying http://automationpractice.com/js/tools.js could save 4.8KiB (30% reduction).
- Minifying http://automationpractice.com/…odules/blockwishlist/js/ajax-wishlist.js could save 3.6KiB (37% reduction).
- Minifying http://automationpractice.com/…s/modules/blocktopmenu/js/hoverIntent.js could save 3.4KiB (70% reduction).
- Minifying http://automationpractice.com/themes/default-bootstrap/js/global.js could save 3.3KiB (25% reduction).
- Minifying http://automationpractice.com/…es/blocktopmenu/js/superfish-modified.js could save 1.9KiB (29% reduction).
- Minifying http://automationpractice.com/…/modules/blocktopmenu/js/blocktopmenu.js could save 1.6KiB (44% reduction).
- Minifying http://automationpractice.com/…ult-bootstrap/js/tools/treeManagement.js could save 1.6KiB (55% reduction).
- Minifying http://automationpractice.com/…ault-bootstrap/js/products-comparison.js could save 1.6KiB (36% reduction).
- Minifying http://automationpractice.com/…ap/js/modules/blocksearch/blocksearch.js could save 1.5KiB (43% reduction).
- Minifying http://automationpractice.com/js/jquery/plugins/jquery.easing.js could save 1.3KiB (28% reduction).
- Minifying http://automationpractice.com/…dules/blocknewsletter/blocknewsletter.js could save 1.1KiB (66% reduction).
- Minifying http://automationpractice.com/…p/js/modules/homeslider/js/homeslider.js could save 1.1KiB (59% reduction).
- Minifying http://automationpractice.com/modules/blockfacebook/blockfacebook.js could save 1,007B (76% reduction).
- Minifying http://automationpractice.com/themes/default-bootstrap/js/index.js could save 1,000B (90% reduction).
- Minifying http://automationpractice.com/…/autoload/15-jquery.total-storage.min.js could save 610B (24% reduction).
- Minifying http://automationpractice.com/…js/jquery/plugins/jquery.serialScroll.js could save 322B (16% reduction).

Minify CSS
Compacting CSS code can save many bytes of data and speed up download and parse times.

Minify CSS for the following resources to reduce their size by 52.9KiB (19% reduction).
- Minifying http://automationpractice.com/themes/default-bootstrap/css/global.css could save 33.7KiB (17% reduction).
- Minifying http://automationpractice.com/…trap/css/modules/blockcart/blockcart.css could save 3.2KiB (24% reduction).
- Minifying http://automationpractice.com/…s/default-bootstrap/css/product_list.css could save 3.1KiB (20% reduction).
- Minifying http://automationpractice.com/…otstrap/css/autoload/uniform.default.css could save 2.5KiB (22% reduction).
- Minifying http://automationpractice.com/…ules/productcomments/productcomments.css could save 1.8KiB (25% reduction).
- Minifying http://automationpractice.com/…ap/css/modules/homeslider/homeslider.css could save 1.3KiB (22% reduction).
- Minifying http://automationpractice.com/…/blocktopmenu/css/superfish-modified.css could save 1.3KiB (24% reduction).
- Minifying http://automationpractice.com/…/modules/blockwishlist/blockwishlist.css could save 983B (23% reduction).
- Minifying http://automationpractice.com/…ery/plugins/fancybox/jquery.fancybox.css could save 942B (20% reduction).
- Minifying http://automationpractice.com/…ules/blockcategories/blockcategories.css could save 682B (25% reduction).
- Minifying http://automationpractice.com/…ules/blocknewsletter/blocknewsletter.css could save 639B (22% reduction).
- Minifying http://automationpractice.com/…strap/css/autoload/responsive-tables.css could save 502B (36% reduction).
- Minifying http://automationpractice.com/…ules/blockcurrencies/blockcurrencies.css could save 449B (24% reduction).
- Minifying http://automationpractice.com/modules/themeconfigurator/css/hooks.css could save 440B (33% reduction).
- Minifying http://automationpractice.com/…odules/blocklanguages/blocklanguages.css could save 435B (25% reduction).
- Minifying http://automationpractice.com/…ins/autocomplete/jquery.autocomplete.css could save 403B (50% reduction).
- Minifying http://automationpractice.com/…/css/modules/blocksearch/blocksearch.css could save 365B (23% reduction).
- Minifying http://automationpractice.com/…ss/modules/blockcontact/blockcontact.css could save 283B (22% reduction).

Eliminate render-blocking JavaScript and CSS in above-the-fold content

Your page has 1 blocking CSS resources. This causes a delay in rendering your page.
None of the above-the-fold content on your page could be rendered without waiting for the following resources to load. Try to defer or asynchronously load blocking resources, or inline the critical portions of those resources directly in the HTML.

Optimise CSS Delivery of the following:
- http://automationpractice.com/themes/default-bootstrap/css/global.css

Minify HTML
Compacting HTML code, including any inline JavaScript and CSS contained in it, can save many bytes of data and speed up download and parse times.

Minify HTML for the following resources to reduce their size by 16.3KiB (21% reduction).
- Minifying http://automationpractice.com/index.php could save 16.3KiB (21% reduction).

Reduce server response time

In my test, your server responded in 0.30 seconds. There are many factors included here that can slow down your server response time. 

*****************************************************************************************************************************************************************************************************************************************************************************

To summarise (for Desktop), 
google scores your site at 48/100 in relation to optimisation (with average scoring for page speed) which is well outside the appropriate score to be considered relevant using googles search algorithm.
I would suggest postponing the release of this to live until we sort out some (preferably all) of the issues mentioned above, as it could have a more damaging impact to business releasing this over releasing nothing (in which time we can market the site or research future tech further to fill the release void created by not releasing).

***Worth creating unique IDs for elements throughout, for easier object identification***
***Automation is possible as is through ACTIONS, however, no advised as it will make the test suite fragile and hard to maintain.***

