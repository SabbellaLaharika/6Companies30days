class Solution:
    def numberToWords(self, num: int) -> str:
        if num == 0 :
            return \Zero\
        d = { 0 : \Zero\, 1 : \One\, 10 : \Ten\, 100 : \One Hundred\, 1000 : \One Thousand\, 10000 : \Ten Thousand\, 100000 : \One Hundred Thousand\, 1000000 : \One Million\, 10000000 : \Ten Million\, 100000000 : \One Hundred Million\, 1000000000 : \One Billion\} 
        if num in d :
            return d[num]
        ones = [\\,\One\, \Two\, \Three\, \Four\, \Five\, \Six\, \Seven\, \Eight\, \Nine\, \Ten\,  \Eleven\, \Twelve\, \Thirteen\, \Fourteen\, \Fifteen\, \Sixteen\, \Seventeen\,   \Eighteen\, \Nineteen\]
        tens = [\\, \Ten\,\Twenty\,\Thirty\, \Forty\, \Fifty\, \Sixty\, \Seventy\, \Eighty\, \Ninety\]
        hundreds = [\\,\One Hundred\, \Two Hundred\, \Three Hundred\, \Four Hundred\, \Five Hundred\, \Six Hundred\, \Seven Hundred\, \Eight Hundred\, \Nine Hundred\]

        li = []
        i = 1
        while num > 0 :
            onerem = num % 10
            tworem = num % 100
            threerem = num % 1000
            if i % 3 == 1 :
                if tworem == 0 :
                    res = hundreds[threerem // 100]
                    i += 2
                    num //= 100
                elif 9 < tworem < 20 :
                    num //= 10
                    i += 1
                    res = ones[tworem]
                elif onerem == 0 and 19 < tworem < 99:
                    res = tens[tworem // 10]
                    i += 1
                    num //= 10
                else :
                    res = ones[onerem]
                if threerem != 0 :
                    if i == 4 or i == 5 or i == 6:
                        res += \ Thousand\
                    elif i == 7 or i == 8 or i == 9:
                        res += \ Million\
                    elif i == 10 or i == 11 or i == 12:
                        res += \ Billion\
            elif i % 3 == 2 :
                res = tens[onerem]
            elif i % 3 == 0 : 
                res = hundreds[onerem]
            if res != '' :
                li.append(res)
            num //= 10
            i += 1
        li.reverse()
        print(li)
        return \ \.join(li)