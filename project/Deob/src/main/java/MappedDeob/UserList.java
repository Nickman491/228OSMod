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
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="sr")
@Implements(value="UserList")
public abstract class UserList {
    @ObfuscatedName(value="tx")
    @ObfuscatedSignature(descriptor="Lbp;")
    @Export(value="pcmStreamMixer")
    static PcmStreamMixer pcmStreamMixer;
    @ObfuscatedName(value="at")
    @ObfuscatedGetter(intValue=-1177259493)
    @Export(value="capacity")
    final int capacity;
    @ObfuscatedName(value="ac")
    @ObfuscatedGetter(intValue=-1595213487)
    @Export(value="size")
    int size = 0;
    @ObfuscatedName(value="au")
    @ObfuscatedSignature(descriptor="[Lso;")
    @Export(value="array")
    User[] array;
    @ObfuscatedName(value="as")
    @Export(value="usernamesMap")
    HashMap usernamesMap;
    @ObfuscatedName(value="aq")
    @Export(value="previousUsernamesMap")
    HashMap previousUsernamesMap;
    @ObfuscatedName(value="af")
    @Export(value="comparator")
    Comparator comparator = null;

    UserList(int n) {
        this.capacity = n;
        this.array = this.newTypedArray(n);
        this.usernamesMap = new HashMap(n / 8);
        this.previousUsernamesMap = new HashMap(n / 8);
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(B)Lso;", garbageValue="35")
    @Export(value="newInstance")
    abstract User newInstance();

    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(II)[Lso;", garbageValue="-1808909632")
    @Export(value="newTypedArray")
    abstract User[] newTypedArray(int var1);

    @ObfuscatedName(value="bi")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="1394017379")
    @Export(value="clear")
    public void clear() {
        this.size = 0;
        Arrays.fill(this.array, null);
        this.usernamesMap.clear();
        this.previousUsernamesMap.clear();
    }

    @ObfuscatedName(value="bz")
    @ObfuscatedSignature(descriptor="(I)I", garbageValue="-1657712133")
    @Export(value="getSize")
    public int getSize() {
        return this.size;
    }

    @ObfuscatedName(value="bt")
    @ObfuscatedSignature(descriptor="(I)Z", garbageValue="653055413")
    @Export(value="isFull")
    public boolean isFull() {
        return this.size == this.capacity;
    }

    @ObfuscatedName(value="bf")
    @ObfuscatedSignature(descriptor="(Lwb;B)Z", garbageValue="-71")
    @Export(value="contains")
    public boolean contains(Username username) {
        if (!username.hasCleanName()) {
            return false;
        }
        if (this.usernamesMap.containsKey(username)) {
            return true;
        }
        return this.previousUsernamesMap.containsKey(username);
    }

    @ObfuscatedName(value="by")
    @ObfuscatedSignature(descriptor="(Lwb;B)Lso;", garbageValue="1")
    @Export(value="getByUsername")
    public User getByUsername(Username username) {
        User user = this.getByCurrentUsername(username);
        if (user != null) {
            return user;
        }
        return this.getByPreviousUsername(username);
    }

    @ObfuscatedName(value="bm")
    @ObfuscatedSignature(descriptor="(Lwb;I)Lso;", garbageValue="712815494")
    @Export(value="getByCurrentUsername")
    User getByCurrentUsername(Username username) {
        if (!username.hasCleanName()) {
            return null;
        }
        return (User)this.usernamesMap.get(username);
    }

    @ObfuscatedName(value="bp")
    @ObfuscatedSignature(descriptor="(Lwb;I)Lso;", garbageValue="-996360738")
    @Export(value="getByPreviousUsername")
    User getByPreviousUsername(Username username) {
        if (!username.hasCleanName()) {
            return null;
        }
        return (User)this.previousUsernamesMap.get(username);
    }

    @ObfuscatedName(value="bg")
    @ObfuscatedSignature(descriptor="(Lwb;I)Z", garbageValue="-605591244")
    @Export(value="removeByUsername")
    public final boolean removeByUsername(Username username) {
        User user = this.getByCurrentUsername(username);
        if (user == null) {
            return false;
        }
        this.remove(user);
        return true;
    }

    @ObfuscatedName(value="bc")
    @ObfuscatedSignature(descriptor="(Lso;I)V", garbageValue="-1907086989")
    @Export(value="remove")
    final void remove(User user) {
        int n = this.indexOf(user);
        if (n == -1) {
            return;
        }
        this.arrayRemove(n);
        this.mapRemove(user);
    }

    @ObfuscatedName(value="bv")
    @ObfuscatedSignature(descriptor="(Lwb;B)Lso;", garbageValue="1")
    @Export(value="addLastNoPreviousUsername")
    User addLastNoPreviousUsername(Username username) {
        return this.addLast(username, null);
    }

    @ObfuscatedName(value="bq")
    @ObfuscatedSignature(descriptor="(Lwb;Lwb;I)Lso;", garbageValue="1721213229")
    @Export(value="addLast")
    User addLast(Username username, Username username2) {
        if (this.getByCurrentUsername(username) != null) {
            throw new IllegalStateException();
        }
        User user = this.newInstance();
        user.set(username, username2);
        this.arrayAddLast(user);
        this.mapPut(user);
        return user;
    }

    @ObfuscatedName(value="ba")
    @ObfuscatedSignature(descriptor="(II)Lso;", garbageValue="-194587924")
    @Export(value="get")
    public final User get(int n) {
        if (n >= 0 && n < this.size) {
            return this.array[n];
        }
        throw new ArrayIndexOutOfBoundsException(n);
    }

    @ObfuscatedName(value="bk")
    @ObfuscatedSignature(descriptor="(B)V", garbageValue="104")
    @Export(value="sort")
    public final void sort() {
        if (this.comparator != null) {
            Arrays.sort(this.array, 0, this.size, this.comparator);
        } else {
            Arrays.sort(this.array, 0, this.size);
        }
    }

    @ObfuscatedName(value="bs")
    @ObfuscatedSignature(descriptor="(Lso;Lwb;Lwb;I)V", garbageValue="-1662599861")
    @Export(value="changeName")
    final void changeName(User user, Username username, Username username2) {
        this.mapRemove(user);
        user.set(username, username2);
        this.mapPut(user);
    }

    @ObfuscatedName(value="bj")
    @ObfuscatedSignature(descriptor="(Lso;I)I", garbageValue="715861802")
    @Export(value="indexOf")
    final int indexOf(User user) {
        int n = 0;
        while (n < this.size) {
            if (this.array[n] == user) {
                return n;
            }
            ++n;
        }
        return -1;
    }

    @ObfuscatedName(value="bo")
    @ObfuscatedSignature(descriptor="(Lso;S)V", garbageValue="12018")
    @Export(value="mapRemove")
    final void mapRemove(User user) {
        if (this.usernamesMap.remove(user.username) == null) {
            throw new IllegalStateException();
        }
        if (user.previousUsername != null) {
            this.previousUsernamesMap.remove(user.previousUsername);
        }
    }

    @ObfuscatedName(value="be")
    @ObfuscatedSignature(descriptor="(Lso;I)V", garbageValue="1325537687")
    @Export(value="arrayAddLast")
    final void arrayAddLast(User user) {
        this.array[++this.size - 1] = user;
    }

    @ObfuscatedName(value="bn")
    @ObfuscatedSignature(descriptor="(Lso;B)V", garbageValue="-18")
    @Export(value="mapPut")
    final void mapPut(User user) {
        User user2;
        this.usernamesMap.put(user.username, user);
        if (user.previousUsername != null && (user2 = this.previousUsernamesMap.put(user.previousUsername, user)) != null && user2 != user) {
            user2.previousUsername = null;
        }
    }

    @ObfuscatedName(value="br")
    @ObfuscatedSignature(descriptor="(IB)V", garbageValue="-62")
    @Export(value="arrayRemove")
    final void arrayRemove(int n) {
        --this.size;
        if (n < this.size) {
            System.arraycopy(this.array, n + 1, this.array, n, this.size - n);
        }
    }

    @ObfuscatedName(value="bl")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="1045943049")
    @Export(value="removeComparator")
    public final void removeComparator() {
        this.comparator = null;
    }

    @ObfuscatedName(value="cb")
    @ObfuscatedSignature(descriptor="(Ljava/util/Comparator;I)V", garbageValue="-589206410")
    @Export(value="addComparator")
    public final void addComparator(Comparator comparator) {
        if (this.comparator != null) {
            if (this.comparator instanceof AbstractUserComparator) {
                ((AbstractUserComparator)this.comparator).addComparator(comparator);
            }
        } else {
            this.comparator = comparator;
        }
    }
}

