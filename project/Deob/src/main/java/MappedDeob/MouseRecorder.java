/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.Export
 *  net.runelite.mapping.Implements
 *  net.runelite.mapping.ObfuscatedGetter
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="de")
@Implements(value="MouseRecorder")
public class MouseRecorder
implements Runnable {
    @ObfuscatedName(value="ay")
    @Export(value="isRunning")
    boolean isRunning = true;
    @ObfuscatedName(value="ah")
    @Export(value="lock")
    Object lock = new Object();
    @ObfuscatedName(value="az")
    @ObfuscatedGetter(intValue=-2087384675)
    @Export(value="index")
    int index = 0;
    @ObfuscatedName(value="ao")
    @Export(value="xs")
    int[] xs = new int[500];
    @ObfuscatedName(value="ad")
    @Export(value="ys")
    int[] ys = new int[500];
    @ObfuscatedName(value="an")
    @Export(value="millis")
    long[] millis = new long[500];

    MouseRecorder() {
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void run() {
        while (this.isRunning) {
            Object object = this.lock;
            synchronized (object) {
                if (this.index < 500) {
                    this.xs[this.index] = MouseHandler.MouseHandler_x;
                    this.ys[this.index] = MouseHandler.MouseHandler_y;
                    this.millis[this.index] = MouseHandler.MouseHandler_millis;
                    ++this.index;
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
            File file = new File(class502.userHomeDirectory, "random.dat");
            if (file.exists()) {
                JagexCache.JagexCache_randomDat = new BufferedFile(new AccessFile(file, "rw", 25L), 24, 0);
            } else {
                block2: for (int i = 0; i < BuddyRankComparator.field1522.length; ++i) {
                    for (n = 0; n < class355.field3789.length; ++n) {
                        File file2 = new File(class355.field3789[n] + BuddyRankComparator.field1522[i] + File.separatorChar + "random.dat");
                        if (!file2.exists()) continue;
                        JagexCache.JagexCache_randomDat = new BufferedFile(new AccessFile(file2, "rw", 25L), 24, 0);
                        break block2;
                    }
                }
            }
            if (JagexCache.JagexCache_randomDat == null) {
                RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
                n = randomAccessFile.read();
                randomAccessFile.seek(0L);
                randomAccessFile.write(n);
                randomAccessFile.seek(0L);
                randomAccessFile.close();
                JagexCache.JagexCache_randomDat = new BufferedFile(new AccessFile(file, "rw", 25L), 24, 0);
            }
        }
        catch (IOException iOException) {
            // empty catch block
        }
    }

    @ObfuscatedName(value="cb")
    @ObfuscatedSignature(descriptor="(Ljava/lang/String;I)I", garbageValue="-1832120228")
    @Export(value="stringCp1252NullTerminatedByteSize")
    public static int stringCp1252NullTerminatedByteSize(String string) {
        return string.length() + 1;
    }

    /*
     * Enabled aggressive block sorting
     */
    @ObfuscatedName(value="gu")
    @ObfuscatedSignature(descriptor="(IB)V", garbageValue="-67")
    @Export(value="getLoginError")
    static void getLoginError(int n) {
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
                                                                                                                                                                    class150.setLoginResponseString("Connection timed out.", "Please try using a different world.", "");
                                                                                                                                                                    break block9;
                                                                                                                                                                }
                                                                                                                                                                if (n != -2) break block11;
                                                                                                                                                                class150.setLoginResponseString("Error connecting to server.", "Please try using a different world.", "");
                                                                                                                                                                break block9;
                                                                                                                                                            }
                                                                                                                                                            if (n != -1) break block12;
                                                                                                                                                            class150.setLoginResponseString("No response from server.", "Please try using a different world.", "");
                                                                                                                                                            break block9;
                                                                                                                                                        }
                                                                                                                                                        if (n != 3) break block13;
                                                                                                                                                        Varcs.method3212(3);
                                                                                                                                                        Login.field933 = 1;
                                                                                                                                                        break block9;
                                                                                                                                                    }
                                                                                                                                                    if (n != 4) break block14;
                                                                                                                                                    class209.method4822(0);
                                                                                                                                                    break block9;
                                                                                                                                                }
                                                                                                                                                if (n != 5) break block15;
                                                                                                                                                Login.field933 = 2;
                                                                                                                                                class150.setLoginResponseString("Either your account is still logged in, or the last", "world you were using has become unavailable.", "Please try again later.");
                                                                                                                                                break block9;
                                                                                                                                            }
                                                                                                                                            if (n != 68) break block16;
                                                                                                                                            if (Client.field511) break block17;
                                                                                                                                            break block18;
                                                                                                                                        }
                                                                                                                                        if (Client.onMobile || n != 6) break block19;
                                                                                                                                        class150.setLoginResponseString("RuneScape has been updated!", "Please restart your client.", "");
                                                                                                                                        break block9;
                                                                                                                                    }
                                                                                                                                    if (n != 7) break block20;
                                                                                                                                    class150.setLoginResponseString("This world is full.", "Please use a different world.", "");
                                                                                                                                    break block9;
                                                                                                                                }
                                                                                                                                if (n != 8) break block21;
                                                                                                                                class150.setLoginResponseString("Unable to connect.", "Login server offline.", "");
                                                                                                                                break block9;
                                                                                                                            }
                                                                                                                            if (n != 9) break block22;
                                                                                                                            class150.setLoginResponseString("Login limit exceeded.", "Too many connections from your address.", "");
                                                                                                                            break block9;
                                                                                                                        }
                                                                                                                        if (n != 10) break block23;
                                                                                                                        class150.setLoginResponseString("Unable to connect.", "Bad session id.", "");
                                                                                                                        break block9;
                                                                                                                    }
                                                                                                                    if (n != 11) break block24;
                                                                                                                    class150.setLoginResponseString("We suspect someone knows your password.", "Press 'change your password' on front page.", "");
                                                                                                                    break block9;
                                                                                                                }
                                                                                                                if (n != 12) break block25;
                                                                                                                class360.updateGameState(10);
                                                                                                                class150.setLoginResponseString("You need a members' account to use this world.", "Please subscribe to login to this world,", "or use a different world.");
                                                                                                                Varcs.method3212(34);
                                                                                                                break block9;
                                                                                                            }
                                                                                                            if (n != 13) break block26;
                                                                                                            class150.setLoginResponseString("Could not complete login.", "Please try using a different world.", "");
                                                                                                            break block9;
                                                                                                        }
                                                                                                        if (n != 14) break block27;
                                                                                                        class150.setLoginResponseString("The server is being updated.", "Please wait a few minutes", "before trying again.");
                                                                                                        break block9;
                                                                                                    }
                                                                                                    if (n != 16) break block28;
                                                                                                    class150.setLoginResponseString("Too many login attempts.", "You can use the Jagex Launcher to continue playing.", "Press the button below to download it now.");
                                                                                                    Varcs.method3212(33);
                                                                                                    break block9;
                                                                                                }
                                                                                                if (n != 17) break block29;
                                                                                                class150.setLoginResponseString("To access this free world, log into a", "members world and move your character", "to a non-members area.");
                                                                                                break block9;
                                                                                            }
                                                                                            if (n != 18) break block30;
                                                                                            class209.method4822(1);
                                                                                            break block9;
                                                                                        }
                                                                                        if (n != 19) break block31;
                                                                                        class150.setLoginResponseString("This world is running a", "closed Beta. Please ", "use a different world.");
                                                                                        break block9;
                                                                                    }
                                                                                    if (n != 20) break block32;
                                                                                    class150.setLoginResponseString("Invalid loginserver requested.", "Please try using a different world.", "");
                                                                                    break block9;
                                                                                }
                                                                                if (n != 22) break block33;
                                                                                class150.setLoginResponseString("Malformed login packet.", "Please try again.", "");
                                                                                break block9;
                                                                            }
                                                                            if (n != 23) break block34;
                                                                            class150.setLoginResponseString("No reply from loginserver.", "Please wait 1 minute and try again.", "");
                                                                            break block9;
                                                                        }
                                                                        if (n != 24) break block35;
                                                                        class150.setLoginResponseString("Error loading your profile.", "Please contact customer support.", "");
                                                                        break block9;
                                                                    }
                                                                    if (n != 25) break block36;
                                                                    class150.setLoginResponseString("Unexpected loginserver response.", "Please try using a different world.", "");
                                                                    break block9;
                                                                }
                                                                if (n != 26) break block37;
                                                                class150.setLoginResponseString("This computers address has been blocked", "as it was used to break our rules.", "");
                                                                break block9;
                                                            }
                                                            if (n != 27) break block38;
                                                            class150.setLoginResponseString("", "Service unavailable.", "");
                                                            break block9;
                                                        }
                                                        if (n != 31) break block39;
                                                        class150.setLoginResponseString("Your account must have a displayname set", "in order to play the game.  Please set it", "via the website, or the main game.");
                                                        break block9;
                                                    }
                                                    if (n != 32) break block40;
                                                    class209.method4822(2);
                                                    break block9;
                                                }
                                                if (n != 37) break block41;
                                                class150.setLoginResponseString("Your account is currently inaccessible.", "Please try again in a few minutes.", "");
                                                break block9;
                                            }
                                            if (n != 38) break block42;
                                            class150.setLoginResponseString("You need to vote to play!", "Visit runescape.com and vote,", "and then come back here!");
                                            break block9;
                                        }
                                        if (n != 74) break block43;
                                        class150.setLoginResponseString("Access to this world is", "restricted. Please use", "a different world.");
                                        break block9;
                                    }
                                    if (n != 55) break block44;
                                    Varcs.method3212(8);
                                    break block9;
                                }
                                if (n == 56) {
                                    class150.setLoginResponseString("Enter the 6-digit code generated by your", "authenticator app.", "");
                                    class360.updateGameState(11);
                                    return;
                                }
                                if (n == 57) {
                                    class150.setLoginResponseString("The code you entered was incorrect.", "Please try again.", "");
                                    class360.updateGameState(11);
                                    return;
                                }
                                if (n != 61) break block45;
                                class150.setLoginResponseString("", "Please enter your date of birth (DD/MM/YYYY)", "");
                                Varcs.method3212(7);
                                break block9;
                            }
                            if (n == 62) {
                                class360.updateGameState(10);
                                Varcs.method3212(9);
                                class150.setLoginResponseString("Login attempt timed out.", "Please try again.", "");
                                return;
                            }
                            if (n == 63) {
                                class360.updateGameState(10);
                                Varcs.method3212(9);
                                class150.setLoginResponseString("You were signed out.", "Please sign in again.", "");
                                return;
                            }
                            if (n == 65 || n == 67) break block46;
                            if (n != 71) break block47;
                            class360.updateGameState(10);
                            Varcs.method3212(7);
                            class150.setLoginResponseString("There was a problem updating your DOB.", "Please try again later. If the problem ", "persists, please contact Jagex Support.");
                            break block9;
                        }
                        if (n == 73) {
                            class360.updateGameState(10);
                            Varcs.method3212(6);
                            class150.setLoginResponseString("Your date of birth information is waiting", "to be reviewed by our staff.", "It will be processed shortly.");
                            break block9;
                        } else if (n == 72) {
                            class360.updateGameState(10);
                            Varcs.method3212(32);
                            break block9;
                        } else {
                            class150.setLoginResponseString("Unexpected server response", "Please try using a different world.", "");
                        }
                        break block9;
                    }
                    class360.updateGameState(10);
                    Varcs.method3212(9);
                    class150.setLoginResponseString("Failed to login.", "Please try again.", "");
                    return;
                }
                Client.field511 = true;
                ModelData0.method4808();
                return;
            }
            class150.setLoginResponseString("RuneScape has been updated!", "Please restart your client.", "");
        }
        class360.updateGameState(10);
        if (n2 != class336.method6884()) {
            return;
        }
        boolean bl = false;
        boolean bl2 = bl;
        if (bl2) return;
        if (!Client.field741.method10576()) return;
        Varcs.method3212(9);
    }
}

