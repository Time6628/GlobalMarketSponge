package com.kookykraftmc.gm.command;

import org.spongepowered.api.command.CommandException;
import org.spongepowered.api.command.CommandResult;
import org.spongepowered.api.command.CommandSource;
import org.spongepowered.api.command.args.CommandContext;
import org.spongepowered.api.command.spec.CommandExecutor;
import org.spongepowered.api.text.Text;
import org.spongepowered.api.text.format.TextColors;

public class MenuCommand implements CommandExecutor {



    @Override
    public CommandResult execute(CommandSource src, CommandContext args) throws CommandException {
        src.sendMessage(Text.of(TextColors.AQUA, "This should open the main menu for GlobalMarket."));
        //TODO: Open the GlobalMarket Menu
        return CommandResult.success();
    }


}
