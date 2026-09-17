
d = 5000
m = 5

AD = [100, 300, 500, 300, 100]
RT = [1, 2, 3, 2, 1]
RQ = [0, 0, 0, 0, 0]

count = 0       

while d > 0:

    damage = 0

    # Find squads ready to attack
    for i in range(m):

        if RQ[i] == 0:
            damage += AD[i]

            # Reset cooldown
            RQ[i] = RT[i]

    # Reduce Titan HP
    d -= damage

    print("Count:", count)
    print("Damage:", damage)
    print("Remaining HP:", d)
    print("RQ:", RQ)
    print()

    # Increase count
    count += 1

    # Decrease cooldown for all squads
    for i in range(m):
        if RQ[i] > 0:
            RQ[i] -= 1

print("Total Count:", count)