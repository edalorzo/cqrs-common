package com.backcountry.fulfillment.cqrs.commands.api

interface CommandHandler<in T> where T: Command {
    fun handle(command: T)
}