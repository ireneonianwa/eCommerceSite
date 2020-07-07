eCommerce Web Application Project

Plan to have 'check in' communication times multiple times per day to keep each other informed, help one another, collaborate on design, and assign tasks.

Set deadlines with each other, agreeing on build progress steps expected at the next check in.

* Create Application Packages: config, controller, model, repository, service, etc.
1. Model
- Defined models: User, Role, LineItem, Cart, Order, etc.
- In model, create associations between objects and apply appropriate annotations (@Entity or @Id, etc) and validation annotations (@NotBlank ..) for imports.
- Add source generators such as getters/setters, constructors, and toString().

2. Repositories 
- Build out the database interfaces
- Track items such as cart and lineitem in OrderRepository until shopping event goes through to an Order
- Include Crud Repository  and repo notation. Add method signatures needed

3. Service
- Build service classes within service package
- Add annotation @Service and use @Autowired to connect repositories 
-  Define basic methods and methods to handleactivities to support the controllers

4. Controllers
- Build controllers
- Use annotation @Controller so that the methods return html, thymeleaf template pages to user
- Build paths needed to render the browser pages and requests of the user via the browser

5. Client Side Resources
- Organize pages for the public facing 'storefront' side
- Create folders for storefront and admin and respectfully add html pages
-Connect template pages with mapped controller methods (GET and POST mapping) with return statements
- Add script and link tags for CSS and JS assets in fragments.
