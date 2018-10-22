![Stack Builders](https://github.com/stackbuilders/nano-chat/raw/master/sb.png)

# Description

Hooray! You're about to begin coding in the [Stack Builders code challenge](https://www.stackbuilders.com/code-challenge). In this repository you will find the challenge description and some useful templates so you can save time and focus on the software architecture design.

## How is this project going to be evaluated

**Technical skills:**
Your code should be of high quality, clean and well-organized.

**Teamwork:** 
Your ability to work effectively with your teammates. 

**Communication skills:**
Your ability to communicate effectively with your team members and with the external client. Some of our developers will play the role of a client to make the event more interesting and real.

**Client-oriented approach:**
Your ability to effectively respond to the client’s needs.

At the end of the code challenge, there will be a show & tell for the judges. Be prepared to *pitch* your idea to them and explain why yours is the best solution.

So, what are you waiting for? Are you up for the challenge?


# The Challenge 

L’Ultima Cena is a popular pizza chain in the city of New York with over 30 locations, serving over 150,000 happy customers each day. 

At L’Ultima Cena, our mission is simple: enhance and educate the palate with the freshest ingredients and flavors, while surprising and exciting each guest with personal care and service.

## Our Website

As we grow and try to expand our business, we want to improve the services we offer to our clients. Because of this, we want to build a website for online orders. We don’t have anything implemented yet so we want to build it from scratch.

The general requirements for the first version of the website are:

- For the initial version of the site, the design can be simple.
- No need to use a frontend framework, for now. You can use simple HTML forms if you wish.
- No need to use a frontend framework, for now, you can use simple HTML forms if you wish.
- You can use the database or persistence engine you desire (even in-memory objects or files).

The initial version will have these pages:

1. **Place your order page:** Clients can order their pizza here, and this information should get persisted to a database or file. We have some products that also need to be stored. We want our clients to be able to customize their own pizzas. Our menu is the following:

    <table style="width: 100%;">
     <tr>
      <td>

    Size | Price
    --- | ---
    Small | $5
    Medium | $8
    Large | $11

      </td>
      <td>

    Ingredient | Price
    --- | ---
    Extra cheese | $1
    Anchovies | $2
    Pineapple | $1
    Onions | $1
    Caviar | $5
    Kobe beef | $10

      </td>
     </tr>
    </table>
    
    (You can use this [template](templates/index.html) for this page).

2. **View orders page:** Simple list of the orders that the clients have entered. You can use this [template](templates/orders.html) for this page.
3. **View order page:** A single page view of an order. You can use this [template](templates/order-detail.html) for this page.

## HTML Templates

We will provide a set of HTML pages with the front-end part of the exercice. Additionally, if you want a static server we already set it up for you as well.
You just have to do the back-end part and replace the endpoints in the JS files with your own.
Please read the [templates/README](templates/README) for more details.

# License

MIT, see the [LICENSE](LICENSE) file.
