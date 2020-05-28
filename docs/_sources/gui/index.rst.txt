Guis
=====

Guis like slots can have functions and failfunctions.
Below is an example of a gui.
If you do not know how any function works take a look at the `function documentation. <../functions>`_

.. code-block:: yaml

   title: "&c&lTest GUI"
   rows: 5
   mode: "set" #Set will set items at the index, starting at 1
               #Where as 'add' will add items into the gui instead of setting at a specific index
   close: false #Whether or not slots will close the gui, false will not close the gui
   locations: 
   - "0,64,0,world" #Locations the gui can be clicked on in the world
   npc:
     citizens: #Plugin that is used for npcs
     - '0' #Npc ids that the gui will be registered to
   alias:
   - "test" #Command aliases

   functions:
     load-functions:
	   type: "load"
	   functions:
       - "permission: gui.test" #Permission needed to open the gui
       - "sound: LAVA,1.0,1.0" #Sound will be played if player has the permission

   '0':
     icon: "EXP_BOTTLE"
     name: "&6Level test"
     lore:
     - "&cYou have to have at least level 1337 for this to pass"
     functions:
       click:
         type:
         - "left"
         - "right"
         - "middle"
         functions:
         - "checklevel: 1337" #Checks to see if the user has 1337 exp
         - "broadcast: &cLevel check has passed, you have at least level 1337"