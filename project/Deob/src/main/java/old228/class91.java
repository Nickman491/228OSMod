package old228;/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedGetter
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="de")
public class class91
implements Runnable {
    @ObfuscatedName(value="ay")
    boolean field1094 = true;
    @ObfuscatedName(value="ah")
    Object field1096 = new Object();
    @ObfuscatedName(value="az")
    @ObfuscatedGetter(intValue=-2087384675)
    int field1091 = 0;
    @ObfuscatedName(value="ao")
    int[] field1092 = new int[500];
    @ObfuscatedName(value="ad")
    int[] field1093 = new int[500];
    @ObfuscatedName(value="an")
    long[] field1089 = new long[500];

    class91() {
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void run() {
        while (this.field1094) {
            Object object = this.field1096;
            synchronized (object) {
                if (this.field1091 < 500) {
                    this.field1092[this.field1091] = class35.field201;
                    this.field1093[this.field1091] = class35.field202;
                    this.field1089[this.field1091] = class35.field203;
                    ++this.field1091;
                }
            }
            class174.method3881(50L);
        }
    }

    @ObfuscatedName(value="ad")
    @ObfuscatedSignature(descriptor="(S)V", garbageValue="-5635")
    static void method2635() {
        try {
            int n;
            File file = new File(class502.field5134, "random.dat");
            if (file.exists()) {
                class216.field2392 = new class537(new class536(file, "rw", 25L), 24, 0);
            } else {
                block2: for (int i = 0; i < class128.field1522.length; ++i) {
                    for (n = 0; n < class355.field3789.length; ++n) {
                        File file2 = new File(class355.field3789[n] + class128.field1522[i] + File.separatorChar + "random.dat");
                        if (!file2.exists()) continue;
                        class216.field2392 = new class537(new class536(file2, "rw", 25L), 24, 0);
                        break block2;
                    }
                }
            }
            if (class216.field2392 == null) {
                RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
                n = randomAccessFile.read();
                randomAccessFile.seek(0L);
                randomAccessFile.write(n);
                randomAccessFile.seek(0L);
                randomAccessFile.close();
                class216.field2392 = new class537(new class536(file, "rw", 25L), 24, 0);
            }
        }
        catch (IOException iOException) {
            // empty catch block
        }
    }

    @ObfuscatedName(value="cb")
    @ObfuscatedSignature(descriptor="(Ljava/lang/String;I)I", garbageValue="-1832120228")
    public static int method2631(String string) {
        return string.length() + 1;
    }

    /*
     * Enabled aggressive block sorting
     */
    @ObfuscatedName(value="gu")
    @ObfuscatedSignature(descriptor="(IB)V", garbageValue="-67")
    static void method2634(int n) {
        int n2;
        block9: {
            block17: {
                block18: {
                    block46: {
                        block47: {
                            block45: {
                                block44: {
                                    block43: {
                                        block42: {
                                            block41: {
                                                block40: {
                                                    block39: {
                                                        block38: {
                                                            block37: {
                                                                block36: {
                                                                    block35: {
                                                                        block34: {
                                                                            block33: {
                                                                                block32: {
                                                                                    block31: {
                                                                                        block30: {
                                                                                            block29: {
                                                                                                block28: {
                                                                                                    block27: {
                                                                                                        block26: {
                                                                                                            block25: {
                                                                                                                block24: {
                                                                                                                    block23: {
                                                                                                                        block22: {
                                                                                                                            block21: {
                                                                                                                                block20: {
                                                                                                                                    block19: {
                                                                                                                                        block16: {
                                                                                                                                            block15: {
                                                                                                                                                block14: {
                                                                                                                                                    block13: {
                                                                                                                                                        block12: {
                                                                                                                                                            block11: {
                                                                                                                                                                block10: {
                                                                                                                                                                    n2 = class336.method6884();
                                                                                                                                                                    if (n != -3) break block10;
                                                                                                                                                                    class150.method3595("Connection timed out.", "Please try using a different world.", "");
                                                                                                                                                                    break block9;
                                                                                                                                                                }
                                                                                                                                                                if (n != -2) break block11;
                                                                                                                                                                class150.method3595("Error connecting to server.", "Please try using a different world.", "");
                                                                                                                                                                break block9;
                                                                                                                                                            }
                                                                                                                                                            if (n != -1) break block12;
                                                                                                                                                            class150.method3595("No response from server.", "Please try using a different world.", "");
                                                                                                                                                            break block9;
                                                                                                                                                        }
                                                                                                                                                        if (n != 3) break block13;
                                                                                                                                                        class114.method3212(3);
                                                                                                                                                        class78.field933 = 1;
                                                                                                                                                        break block9;
                                                                                                                                                    }
                                                                                                                                                    if (n != 4) break block14;
                                                                                                                                                    class209.method4822(0);
                                                                                                                                                    break block9;
                                                                                                                                                }
                                                                                                                                                if (n != 5) break block15;
                                                                                                                                                class78.field933 = 2;
                                                                                                                                                class150.method3595("Either your account is still logged in, or the last", "world you were using has become unavailable.", "Please try again later.");
                                                                                                                                                break block9;
                                                                                                                                            }
                                                                                                                                            if (n != 68) break block16;
                                                                                                                                            if (client.field511) break block17;
                                                                                                                                            break block18;
                                                                                                                                        }
                                                                                                                                        if (client.field506 || n != 6) break block19;
                                                                                                                                        class150.method3595("RuneScape has been updated!", "Please restart your old228.client.", "");
                                                                                                                                        break block9;
                                                                                                                                    }
                                                                                                                                    if (n != 7) break block20;
                                                                                                                                    class150.method3595("This world is full.", "Please use a different world.", "");
                                                                                                                                    break block9;
                                                                                                                                }
                                                                                                                                if (n != 8) break block21;
                                                                                                                                class150.method3595("Unable to connect.", "Login server offline.", "");
                                                                                                                                break block9;
                                                                                                                            }
                                                                                                                            if (n != 9) break block22;
                                                                                                                            class150.method3595("Login limit exceeded.", "Too many connections from your address.", "");
                                                                                                                            break block9;
                                                                                                                        }
                                                                                                                        if (n != 10) break block23;
                                                                                                                        class150.method3595("Unable to connect.", "Bad session id.", "");
                                                                                                                        break block9;
                                                                                                                    }
                                                                                                                    if (n != 11) break block24;
                                                                                                                    class150.method3595("We suspect someone knows your password.", "Press 'change your password' on front page.", "");
                                                                                                                    break block9;
                                                                                                                }
                                                                                                                if (n != 12) break block25;
                                                                                                                class360.method7405(10);
                                                                                                                class150.method3595("You need a members' account to use this world.", "Please subscribe to login to this world,", "or use a different world.");
                                                                                                                class114.method3212(34);
                                                                                                                break block9;
                                                                                                            }
                                                                                                            if (n != 13) break block26;
                                                                                                            class150.method3595("Could not complete login.", "Please try using a different world.", "");
                                                                                                            break block9;
                                                                                                        }
                                                                                                        if (n != 14) break block27;
                                                                                                        class150.method3595("The server is being updated.", "Please wait a few minutes", "before trying again.");
                                                                                                        break block9;
                                                                                                    }
                                                                                                    if (n != 16) break block28;
                                                                                                    class150.method3595("Too many login attempts.", "You can use the Jagex Launcher to continue playing.", "Press the button below to download it now.");
                                                                                                    class114.method3212(33);
                                                                                                    break block9;
                                                                                                }
                                                                                                if (n != 17) break block29;
                                                                                                class150.method3595("To access this free world, log into a", "members world and move your character", "to a non-members area.");
                                                                                                break block9;
                                                                                            }
                                                                                            if (n != 18) break block30;
                                                                                            class209.method4822(1);
                                                                                            break block9;
                                                                                        }
                                                                                        if (n != 19) break block31;
                                                                                        class150.method3595("This world is running a", "closed Beta. Please ", "use a different world.");
                                                                                        break block9;
                                                                                    }
                                                                                    if (n != 20) break block32;
                                                                                    class150.method3595("Invalid loginserver requested.", "Please try using a different world.", "");
                                                                                    break block9;
                                                                                }
                                                                                if (n != 22) break block33;
                                                                                class150.method3595("Malformed login packet.", "Please try again.", "");
                                                                                break block9;
                                                                            }
                                                                            if (n != 23) break block34;
                                                                            class150.method3595("No reply from loginserver.", "Please wait 1 minute and try again.", "");
                                                                            break block9;
                                                                        }
                                                                        if (n != 24) break block35;
                                                                        class150.method3595("Error loading your profile.", "Please contact customer support.", "");
                                                                        break block9;
                                                                    }
                                                                    if (n != 25) break block36;
                                                                    class150.method3595("Unexpected loginserver response.", "Please try using a different world.", "");
                                                                    break block9;
                                                                }
                                                                if (n != 26) break block37;
                                                                class150.method3595("This computers address has been blocked", "as it was used to break our rules.", "");
                                                                break block9;
                                                            }
                                                            if (n != 27) break block38;
                                                            class150.method3595("", "Service unavailable.", "");
                                                            break block9;
                                                        }
                                                        if (n != 31) break block39;
                                                        class150.method3595("Your account must have a displayname set", "in order to play the game.  Please set it", "via the website, or the main game.");
                                                        break block9;
                                                    }
                                                    if (n != 32) break block40;
                                                    class209.method4822(2);
                                                    break block9;
                                                }
                                                if (n != 37) break block41;
                                                class150.method3595("Your account is currently inaccessible.", "Please try again in a few minutes.", "");
                                                break block9;
                                            }
                                            if (n != 38) break block42;
                                            class150.method3595("You need to vote to play!", "Visit runescape.com and vote,", "and then come back here!");
                                            break block9;
                                        }
                                        if (n != 74) break block43;
                                        class150.method3595("Access to this world is", "restricted. Please use", "a different world.");
                                        break block9;
                                    }
                                    if (n != 55) break block44;
                                    class114.method3212(8);
                                    break block9;
                                }
                                if (n == 56) {
                                    class150.method3595("Enter the 6-digit code generated by your", "authenticator app.", "");
                                    class360.method7405(11);
                                    return;
                                }
                                if (n == 57) {
                                    class150.method3595("The code you entered was incorrect.", "Please try again.", "");
                                    class360.method7405(11);
                                    return;
                                }
                                if (n != 61) break block45;
                                class150.method3595("", "Please enter your date of birth (DD/MM/YYYY)", "");
                                class114.method3212(7);
                                break block9;
                            }
                            if (n == 62) {
                                class360.method7405(10);
                                class114.method3212(9);
                                class150.method3595("Login attempt timed out.", "Please try again.", "");
                                return;
                            }
                            if (n == 63) {
                                class360.method7405(10);
                                class114.method3212(9);
                                class150.method3595("You were signed out.", "Please sign in again.", "");
                                return;
                            }
                            if (n == 65 || n == 67) break block46;
                            if (n != 71) break block47;
                            class360.method7405(10);
                            class114.method3212(7);
                            class150.method3595("There was a problem updating your DOB.", "Please try again later. If the problem ", "persists, please contact Jagex Support.");
                            break block9;
                        }
                        if (n == 73) {
                            class360.method7405(10);
                            class114.method3212(6);
                            class150.method3595("Your date of birth information is waiting", "to be reviewed by our staff.", "It will be processed shortly.");
                            break block9;
                        } else if (n == 72) {
                            class360.method7405(10);
                            class114.method3212(32);
                            break block9;
                        } else {
                            class150.method3595("Unexpected server response", "Please try using a different world.", "");
                        }
                        break block9;
                    }
                    class360.method7405(10);
                    class114.method3212(9);
                    class150.method3595("Failed to login.", "Please try again.", "");
                    return;
                }
                client.field511 = true;
                class205.method4808();
                return;
            }
            class150.method3595("RuneScape has been updated!", "Please restart your old228.client.", "");
        }
        class360.method7405(10);
        if (n2 != class336.method6884()) {
            return;
        }
        boolean bl = false;
        boolean bl2 = bl;
        if (bl2) return;
        if (!client.field741.method10576()) return;
        class114.method3212(9);
    }
}

