# This describes core concepts of the Protocol

In order to signal to other users of this protocol the Boredperson registers at a Boredserver and sets his/her status to bored. Other users can also register as a requestor and query the bored status of known people.

In detail this works like so:

## REGISTRATION

(DDOS Protection i.e. Sending 5 signed messages with random strings length 64 bit where only one is correctly signed where sending back the wrong string leads to ban)

Person A sends a REGISTRATION request with the type HOME to the HOMESERVER A.
This REGISTRATION request contains the following:
- The PUBLIC PGP KEY Person A wants to register
- Type of REGISTRATION request (in this case HOME)

HOMESERVER A generates a UUID and hashes it with SHA3-256.
HOMESERVER A sends this HASH back to the Person A.

Person A signs a message with the Hash and sends it back to the HOMESERVER A.

HOMESERVER A verifys the signature with the PUBLIC PGP KEY from the first message and if valid adds the bublic key to the server.

## REGISTRATION