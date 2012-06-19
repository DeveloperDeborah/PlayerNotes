package no.runsafe.PlayerNotes.command;

import no.runsafe.PlayerNotes.NoteManager;
import no.runsafe.framework.command.RunsafeCommand;
import no.runsafe.framework.output.Console;
import no.runsafe.framework.server.chunk.RunsafeChunk;
import no.runsafe.framework.server.player.RunsafePlayer;
import org.apache.commons.lang.StringUtils;
import org.bukkit.ChatColor;

import java.util.Arrays;

public class SetCommand extends RunsafeCommand
{
	public SetCommand(NoteManager manager)
	{
		super("set", null, "tier", "note");
		this.manager = manager;
	}

	@Override
	public String requiredPermission()
	{
		return "playernotes.set." + permissionTier;
	}

	@Override
	public boolean CanExecute(RunsafePlayer executor, String[] args)
	{
		if(args == null || args.length == 0)
		{
			permissionTier = "";
			return true;
		}
		permissionTier = args[0];
		return executor.hasPermission("playernotes.set." + args[0]);
	}

	public String OnExecute(String[] args)
	{
		RunsafePlayer player = getPlayer();
		String tier = getArg("tier");
		String note = StringUtils.join(Arrays.copyOfRange(args, 1, args.length - 1), " ");

		manager.setNoteForPlayer(player, tier, note);

		return String.format(("%s note set for %s."), tier, player.getName());
	}

	private RunsafePlayer getPlayer()
	{
		return new RunsafePlayer(superCommand.getArg("player"));
	}

	private NoteManager manager;
	protected String permissionTier;
}
