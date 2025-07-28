/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.Export
 *  net.runelite.mapping.Implements
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="vz")
@Implements(value="UserComparator1")
public class UserComparator1
implements Comparator {
    @ObfuscatedName(value="ay")
    @Export(value="reversed")
    final boolean reversed;

    public UserComparator1(boolean bl) {
        this.reversed = bl;
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(Lso;Lso;I)I", garbageValue="-1279298974")
    @Export(value="compare_bridged")
    int compare_bridged(User user, User user2) {
        return this.reversed ? user.compareTo_user(user2) : user2.compareTo_user(user);
    }

    @Override
    public boolean equals(Object object) {
        return super.equals(object);
    }

    public int compare(Object object, Object object2) {
        return this.compare_bridged((User)object, (User)object2);
    }
}

