package com.metricinches.snippet

import com.metricinches.model.Auction
import net.liftweb.mapper.{By, OrderBy, Descending, MaxRows}

import net.liftweb.util.Helpers._
import net.liftweb.mapper._
import net.liftweb.textile.TextileParser


/**
 * Created with IntelliJ IDEA.
 * User: Steve
 * Date: 7/8/12
 * Time: 7:18 PM
 * To change this template use File | Settings | File Templates.
 */

class Listings {
      def top = {
        val auctions = Auction.findAll(By(
          Auction.isClosed, false),
          MaxRows(3), OrderBy(Auction.id, Descending))
       ".auction_row *" #> auctions.map {
         auction =>
          ".name *" #> auction.name &
          ".desc" #> TextileParser.toHtml( auction.description) &
          "a [href]" #> "/auction/%s".format( auction.id.toString)

       }
      }
}
