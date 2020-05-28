Functions
=========

Functions are the building blocks for customizable guis in DynamicGui.
With functions you can customize `guis <../gui>`_ and `slots <../slot>`_.
Below are the built-in functions for DynamicGui, addons may add more.
If you are interested in making functions take a look at the `developer docs. <../functionapi>`_


=========
Broadcast
=========

The broadcast function is used to send a message to all players on the server.

Usage::

   broadcast: This is a test message!

Broadcasts the message "This is a test message!" to all players.


===========
Check Level
===========

Check a player's exp level.

Usage::

   checklevel: 1000 
   
The function would require the player to have level 1000.


=======================
Check Item Type in Hand
=======================

Check a player's in in their hand.

Usage::

   checkitemtypeinhand: DIRT 
   
The function would check if the user has a dirt in their hand.


==================
Check Player World
==================

Check to see if a player is in a world.

Usage::

   checkplayerworld: world
   
The function would check to see if the player is in the world "world".


===============
Check Slot Tick
===============

Checks the current tick or frame of the given slot, `uses EvalEx. <https://github.com/uklimaschewski/EvalEx>`_ 

Usage::

    checktick: %tick% % 2 == 0
	
This would check if the current tick for the slot is divisible evenly by 2.

Usage::

    checktick: %frame% > 5
	
This would check if the current slot has been open for 100 ticks or 5 frames.

Slots store how long they have been open for and their ticks reset every 20 server ticks.

After a full 20 ticks have passed a full frame of animation has occured.


============
Set Cooldown
============

Sets a cooldown with a name.


Usage::

   setcooldown: name,1000
   
Sets the cooldown named "name" to expire in 1000 millisconds.


=================
Check on cooldown
=================

Checks to see if a named cooldown is still on cooldown.


Usage::

   isoncooldown: name
   
Checks to see if the cooldown named "name" is on cooldown.




=====================
Check not on cooldown
=====================

Checks to see if a named cooldown is off cooldown.


Usage::

   isnotoncooldown: name
   
Checks to see if the cooldown named "name" is off cooldown.

=========
Condition
=========

Checks a condition when evaluated, `uses EvalEx. <https://github.com/uklimaschewski/EvalEx>`_


Usage::

   condition: 5 == 5
   
Checks if 5 is equal to 5, can also be used with replacers.


=============================
Executes a command as console
=============================

Executes a command for the player as console.

**Warning this will not do permission checks for the player**

Usage::

   executec: say Hello from the server!

Executes the say command from console.


=============================
Execute a command as a player
=============================

Makes a player execute a command.

Usage::

   executep: spawn

Makes a player execute the spawn command.


=================
Gamerule Checking
=================

Checks a gamerule for a world.

Usage::

   getgamerule: world,mobSpawning,false

This would check to see if the mobSpawning gamerule is disabled for the world "world".


==================
Gamerule Modifying
==================

Set a gamerule for a world.

Usage::

   setgamerule: world,mobSpawning,false

This would make it so the mobSpawning rule would be disabled in the world "world".


========
Gui open
========

Makes a player open a gui.

Usage::

   gui: test

Makes a player open a gui named "test".


========================
Log a message to console
========================

Log a message to the console so it can be viewed in the log or console.


Usage::

   log: test

Logs the message test to the console and log.


=============
Money balance
=============

Check's a player balance.

Usage::

   moneybalance: 1000

Checks if the player has a balance of  1000 dollars.


============
Money paying
============

Allows a player to pay money.

Usage::

   moneywithdraw: 1000

Makes the player pay 1000 if they have the balance avaliable.


=============
Money deposit
=============

Give a player money.

Usage::

   moneydeposit: 1000

Deposits 1000 to the player's balance avaliable.


===================
Permission checking
===================

Checks if the player has a permission.

Usage::
   
   permission: some.permission

Checks if the player has the permission "some.permission".


=============
No Permission
=============

Checks if a player does not have a permission.

Usage::

   nopermission: some.permission

Checks if the player does not have the permission "some.permission".


=================
Permission adding
=================

The addpermission function is used to add a permission to a player.

Usage::

   addpermission: some.permission  

Adds the permission "some.permission" to the player.


===================
Permission removing
===================

The removepermission function is used to remove a permission from the player.

Usage::

   removepermission: some.permission  

Removes the permission "some.permission" from the player.


========================
Generate a random number
========================

Generates a random number in a number range.

Usage::

   random: 10-9 #Winning number is 9
 
Generates a random number from 1 through 10 and the winning number is 9.


================
Message a player
================

Sends the player a message.

Usage::
   
   pmsg: Hello!
   
Sends the player the message "Hello!".

===========
Remove Slot
===========

Removes the current slot.

Usage::

   removeslot: this
 
Removes the slot from which the function is called.


===========
Reset Frame
===========

Reset the slot's current animation frame

Usage::

   resetframe
 
Resets the animation frame of the slot that it is executed from.


=====================
Send player to server
=====================

Sends the player to a server.

Usage::

   send: testserver
   
Sends the player to the server "testserver".


=======================
Set amount for the slot
=======================

Sets the amount of the current slot.


Usage::

   setamount: 5
   
Sets the slot of the slot to 5.


=============================
Set close for the slot or gui
=============================

Set whether or not the slot or gui should close on click.


Usage::

   setclose: true
   
Sets the slot or gui to close on slot click.


=================
Set data for slot
=================

Set data for the current slot, can be used in **1.12 and below.**

Do not use on **1.13+**

Usage::

   setdata: 1
   
Sets the data value of the current slot to 1.


=====================
Set enchants for slot
=====================

Sets enchants for the current slot.
Check here for the `enchantment enums <https://hub.spigotmc.org/javadocs/spigot/org/bukkit/enchantments/Enchantment.html>`_

Usage::

   setenchants: DURABILITY,1

Sets the current slot to have level 1 durability.

=================
Set lore for slot
=================

Set lore for the current slot.

Usage::

   setlore: test lore
   
Sets the lore for the current slot to "test lore".

Also supports multi-line lore.

Usage::

   setlore: test\nlore
   
Sets the lore for the current slot to "test" on the first line and "lore" on the second.

=================
Set name for slot
=================

Set name for the current slot.

Usage::
   
   setname: name

Sets the name for the current slot to "name".

================
Set nbt for slot
================

Set nbt for the current slot.

Usage::
   
   setnbt: {SkullOwner:\"Notch\"}

Sets the nbt for the current slot to the player head of "Notch".


=================
Set type for slot
=================

Set type for the current slot.

Usage::

  settype: STONE

Sets the type for the current slot to "STONE".


=====
Sound
=====

Plays a sound.

`Look here for sound enums for 1.9+. <https://hub.spigotmc.org/javadocs/spigot/index.html?overview-summary.html>`_

`Look here for sound enums for 1.8. <https://jd.bukkit.org/org/bukkit/Sound.html>`_

Usage::

   sound: LAVA,1.0,0.5
   
Sends a lava sound to the player with 1.0 volume and 0.5 pitch.
   

=========
Statistic
=========

Get a player's statistics.

`Look here for statistics. <https://hub.spigotmc.org/javadocs/spigot/org/bukkit/Statistic.html>`_

Usage::

   statistic: MINE_BLOCK,DIRT,10
   
Checks if the player has mined at least 10 dirt blocks.
